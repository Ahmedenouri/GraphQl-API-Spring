package ma.formation.webService.graphQl.web;

import lombok.AllArgsConstructor;
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
public class ResolverCustomer {
    private final ICustomerService iCustomerService;

    @MutationMapping
    public CustomerResponse saveCustomer (@Argument("customerRequest") CustomerRequest customerRequest){
        return iCustomerService.saveCustomer(customerRequest);
    }

    @QueryMapping
    public CustomerResponse getCustomerById (@Argument("customerId") Long customerId){
        return iCustomerService.getCustomerById(customerId);
    }

    @QueryMapping
    public List<CustomerResponse> getAllCustomers() {
        return iCustomerService.getAllCustomers();
    }
}
