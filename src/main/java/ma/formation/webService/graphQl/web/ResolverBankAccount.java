package ma.formation.webService.graphQl.web;

import lombok.AllArgsConstructor;
import ma.formation.webService.graphQl.service.IBankAccountService;
import ma.formation.webService.graphQl.service.model.dtos.request.BankAccountRequest;
import ma.formation.webService.graphQl.service.model.dtos.response.BankAccountResponse;
import org.hibernate.annotations.processing.Find;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ResolverBankAccount {
    private final IBankAccountService iBankAccountService;

    @MutationMapping
    public BankAccountResponse saveBankAccount (@Argument("bankAccountRequest") BankAccountRequest bankAccountRequest){
        return iBankAccountService.saveBankAccount(bankAccountRequest);
    }

    @QueryMapping
    public List<BankAccountResponse> getAllBankAccounts (){
        return iBankAccountService.getAllBankAccounts();
    }
    @QueryMapping
    public BankAccountResponse GetByIdBankAccount (@Argument("bankAccountId") Long bankAccountId){
        return iBankAccountService.getBankAccountById(bankAccountId);
    }
}
