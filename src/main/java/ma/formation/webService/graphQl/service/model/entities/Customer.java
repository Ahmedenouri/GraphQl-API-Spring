package ma.formation.webService.graphQl.service.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.formation.webService.graphQl.service.model.enums.GenderAccount;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tblCustomer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long idCustomer;
    @Column(unique = true,name = "Reference-number")
    @NotNull(message = "please fill in the field reference number.")
    private String ReferenceCustomer;
    @Column(name = "Firstname")
    private String firstnameCustomer;
    @Column(name = "Lastname")
    private String lastnameCustomer;
    @Column(unique = true,name = "Username")
    @NotNull(message = "please fill in the field username.")
    private String UsernameCustomer;
    @Column(name = "Ville")
    private String villeCustomer;
    @Enumerated(EnumType.STRING)
    @Column(name = "Gender")
    private GenderAccount genderAccount;
}
