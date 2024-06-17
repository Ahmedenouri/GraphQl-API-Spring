package ma.formation.webService.graphQl.web;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.formation.webService.graphQl.service.ICustomerService;
import ma.formation.webService.graphQl.service.model.dtos.request.CustomerRequest;
import ma.formation.webService.graphQl.service.model.dtos.response.CustomerResponse;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
@Slf4j
public class ResolverCustomer {
    private final ICustomerService iCustomerService;

    @MutationMapping
    public CustomerResponse saveCustomer (@Argument("customerRequest") CustomerRequest customerRequest){
        log.debug("Save Customer Controller {}",customerRequest);
        return iCustomerService.saveCustomer(customerRequest);
    }

    @QueryMapping
    public CustomerResponse getCustomerById (@Argument("customerId") Long customerId){
        log.debug("Get Customer By Id Controller {}",customerId);
        return iCustomerService.getCustomerById(customerId);
    }

    @QueryMapping
    public List<CustomerResponse> getAllCustomers() {
        log.error("Get All Customers Controller");
        return iCustomerService.getAllCustomers();
    }
}
