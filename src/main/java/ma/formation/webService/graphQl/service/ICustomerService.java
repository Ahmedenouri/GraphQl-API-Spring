package ma.formation.webService.graphQl.service;


import ma.formation.webService.graphQl.service.model.dtos.request.CustomerRequest;
import ma.formation.webService.graphQl.service.model.dtos.response.CustomerResponse;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    CustomerResponse saveCustomer (CustomerRequest customerRequest);
    CustomerResponse getCustomerById (Long customerId);;
    List<CustomerResponse> getAllCustomers ();

}
