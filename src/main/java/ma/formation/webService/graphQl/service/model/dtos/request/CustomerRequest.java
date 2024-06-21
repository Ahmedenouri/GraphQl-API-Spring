package ma.formation.webService.graphQl.service.model.dtos.request;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.formation.webService.graphQl.service.model.entities.BankAccount;
import ma.formation.webService.graphQl.service.model.enums.GenderAccount;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {
    private Long idCustomer;
    private String ReferenceCustomer;
    private String firstnameCustomer;
    private String lastnameCustomer;
    private String UsernameCustomer;
    private String villeCustomer;
    private GenderAccount genderAccount;
}
