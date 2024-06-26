package ma.formation.webService.graphQl.service.model.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.formation.webService.graphQl.service.model.enums.GenderAccount;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {
    //private Long idCustomer;
    private String ReferenceCustomer;
    private String firstnameCustomer;
    private String lastnameCustomer;
    private String usernameCustomer;
    private String villeCustomer;
    private GenderAccount genderAccount;
}
