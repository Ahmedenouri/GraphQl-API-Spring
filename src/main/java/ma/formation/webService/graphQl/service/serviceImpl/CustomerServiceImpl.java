package ma.formation.webService.graphQl.service.serviceImpl;

import lombok.AllArgsConstructor;
import ma.formation.webService.graphQl.mappers.ICustomerMapper;
import ma.formation.webService.graphQl.repositories.ICustomerRepository;
import ma.formation.webService.graphQl.service.ICustomerService;
import ma.formation.webService.graphQl.service.model.dtos.request.CustomerRequest;
import ma.formation.webService.graphQl.service.model.dtos.response.CustomerResponse;
import ma.formation.webService.graphQl.service.model.exceptions.BusinessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements ICustomerService {
    private final ICustomerRepository iCustomerRepository;
    private final ICustomerMapper iCustomerMapper;

    @Override
    public CustomerResponse saveCustomer(CustomerRequest customerRequest) {
        return iCustomerMapper.map(iCustomerRepository.save(iCustomerMapper.map(customerRequest)));
    }

    @Override
    public CustomerResponse getCustomerById(Long customerId) {
        return iCustomerMapper.map(iCustomerRepository.findById(customerId)
                .orElseThrow(()-> new BusinessException(String.format("Your ID [%s] doesn't exist, Try another one",customerId))));
    }

    @Override
    public List<CustomerResponse> getAllCustomers() {
        return iCustomerMapper.mapToListResponse(iCustomerRepository.findAll());
    }
}
