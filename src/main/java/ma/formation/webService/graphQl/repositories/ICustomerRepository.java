package ma.formation.webService.graphQl.repositories;

import ma.formation.webService.graphQl.service.model.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Long> {
}