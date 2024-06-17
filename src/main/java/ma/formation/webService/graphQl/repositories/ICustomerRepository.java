package ma.formation.webService.graphQl.repositories;

import ma.formation.webService.graphQl.service.model.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
//    Optional<Customer> findByReferenceCustomer (String referenceCustomer);
//    Optional<Customer> findByUsernameCustomer (String usernameCustomer);
}