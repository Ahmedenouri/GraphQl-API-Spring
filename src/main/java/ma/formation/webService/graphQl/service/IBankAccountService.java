package ma.formation.webService.graphQl.service;

import ma.formation.webService.graphQl.service.model.dtos.request.BankAccountRequest;
import ma.formation.webService.graphQl.service.model.dtos.response.BankAccountResponse;
import java.util.List;

public interface IBankAccountService {
    BankAccountResponse saveBankAccount (BankAccountRequest bankAccountRequest);
    BankAccountResponse getBankAccountById (Long bankAccountId);;
    List<BankAccountResponse> getAllBankAccounts ();
}
