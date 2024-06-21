package ma.formation.webService.graphQl.service.model.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.formation.webService.graphQl.service.model.enums.AccountStatus;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountRequest {
    private Long idBankAccount;
    private String ribBankAccount;
    private Double amountBankAccount;
    private Date createAt;
    private AccountStatus accountStatus;

    private CustomerRequest customerRequest;

}
