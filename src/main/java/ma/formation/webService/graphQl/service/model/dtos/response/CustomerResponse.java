package ma.formation.webService.graphQl.service.model.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.formation.webService.graphQl.service.model.enums.GenderAccount;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private Long idCustomer;
    private String ReferenceCustomer;
    private String firstnameCustomer;
    private String lastnameCustomer;
    private String usernameCustomer;
    private String villeCustomer;
    private GenderAccount genderAccount;
}
