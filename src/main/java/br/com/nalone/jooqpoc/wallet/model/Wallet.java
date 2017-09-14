package br.com.nalone.jooqpoc.wallet.model;


import br.com.nalone.jooqpoc.asset.model.Asset;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tb_wallet")
@SequenceGenerator(
        name = "sequenceIdWallet",
        sequenceName = "wallet_id_wallet_seq",
        allocationSize = 1)
public class Wallet {

    @Id
    @NotNull
    @Column(
            name = "id_wallet",
            unique = true,
            nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceIdWallet")
    private Long id;

    @NotNull
    @Column(name = "tx_name")
    private String name;

    @NotNull
    @Column(name = "tx_description")
    private String description;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            targetEntity = Asset.class,
            mappedBy = "wallet",
            orphanRemoval = true)
    private List<Asset> assets;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_investor")
    private Investor investor;

}
