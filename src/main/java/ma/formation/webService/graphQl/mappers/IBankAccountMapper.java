package ma.formation.webService.graphQl.mappers;

import ma.formation.webService.graphQl.service.model.dtos.request.BankAccountRequest;
import ma.formation.webService.graphQl.service.model.dtos.response.BankAccountResponse;
import ma.formation.webService.graphQl.service.model.entities.BankAccount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface IBankAccountMapper {

    @Mapping(source = "customerRequest",target = "customer")
    BankAccount map (BankAccountRequest bankAccountRequest);
    @Mapping(source = "customer",target = "customerResponse")
    BankAccountResponse map (BankAccount bankAccount);

    @Mapping(source = "customerRequest",target = "customer")
    List<BankAccount> mapToListEntity (List<BankAccountRequest> bankAccountRequests);
    @Mapping(source = "customer",target = "customerResponse")
    List<BankAccountResponse> mapToListResponse (List<BankAccount> bankAccounts);
}
