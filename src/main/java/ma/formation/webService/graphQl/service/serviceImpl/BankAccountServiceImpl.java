package ma.formation.webService.graphQl.service.serviceImpl;

import lombok.AllArgsConstructor;
import ma.formation.webService.graphQl.mappers.IBankAccountMapper;
import ma.formation.webService.graphQl.repositories.IBankAccountRepository;
import ma.formation.webService.graphQl.service.IBankAccountService;
import ma.formation.webService.graphQl.service.model.dtos.request.BankAccountRequest;
import ma.formation.webService.graphQl.service.model.dtos.response.BankAccountResponse;
import ma.formation.webService.graphQl.service.model.exceptions.BusinessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BankAccountServiceImpl implements IBankAccountService {
    private final IBankAccountRepository iBankAccountRepository;
    private final IBankAccountMapper iBankAccountMapper;


    @Override
    public BankAccountResponse saveBankAccount(BankAccountRequest bankAccountRequest) {
        return iBankAccountMapper.map(iBankAccountRepository.save(iBankAccountMapper.map(bankAccountRequest)));
    }

    @Override
    public BankAccountResponse getBankAccountById(Long bankAccountId) {
        return iBankAccountMapper.map(iBankAccountRepository
                .findById(bankAccountId).orElseThrow(()-> new BusinessException(String.format("Your ID [%s] doesn't exist, Try another one", bankAccountId))));
    }

    @Override
    public List<BankAccountResponse> getAllBankAccounts() {
        return iBankAccountMapper.mapToListResponse(iBankAccountRepository.findAll());
    }
}
