package br.com.nalone.jooqpoc.wallet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "tb_investor")
@SequenceGenerator(
        name = "sequenceIdInvestor",
        sequenceName = "investor_id_investor_seq",
        allocationSize = 1)
public class Investor {

    @Id
    @NotNull
    @Column(
            name = "id_investor",
            unique = true,
            nullable = false)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequenceIdInvestor")
    private Long id;

    @NotNull
    @Column(name = "tx_firstName")
    private String fistName;

    @NotNull
    @Column(name = "tx_lastName")
    private String lastName;

    @NotNull
    @Column(name = "tx_email")
    private String email;

    @NotNull
    @Column(name = "tx_password")
    private String password;

    @OneToOne(
            mappedBy = "investor",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false)
    private Wallet wallet;

}
