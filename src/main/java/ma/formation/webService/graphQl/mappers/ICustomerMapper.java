package ma.formation.webService.graphQl.mappers;

import ma.formation.webService.graphQl.service.model.dtos.request.CustomerRequest;
import ma.formation.webService.graphQl.service.model.dtos.response.CustomerResponse;
import ma.formation.webService.graphQl.service.model.entities.Customer;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface ICustomerMapper {
    Customer map (CustomerRequest customerRequest);
    CustomerResponse map (Customer customer);
    List<Customer> mapToListEntity (List<CustomerRequest> customerRequests);
    List<CustomerResponse> mapToListResponse (List<Customer> customers);
}
