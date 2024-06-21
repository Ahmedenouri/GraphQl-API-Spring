package ma.formation.webService.graphQl.service.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.formation.webService.graphQl.service.model.enums.AccountStatus;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tblBankAccount")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long idBankAccount;
    @Column(name = "Rib",unique = true)
    @NotNull(message = "please fill in the field rib bank account.")
    private String ribBankAccount;
    @Column(name = "Amount")
    @NotNull(message = "please fill in the field rib Amount.")
    private Double amountBankAccount;
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date createAt;
    @Column(name = "Status")
    @Enumerated(EnumType.STRING)
    @NotNull(message = "please fill in the field status account.")
    private AccountStatus accountStatus;
    @ManyToOne
    @JoinColumn(name = "Reference Customer")
    private Customer customer;

}
