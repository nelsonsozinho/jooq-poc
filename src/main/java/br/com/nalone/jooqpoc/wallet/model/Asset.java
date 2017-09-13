package br.com.nalone.jooqpoc.wallet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tb_asset")
@SequenceGenerator(
        name = "sequenceIdAsset",
        sequenceName = "asset_id_asset_seq",
        allocationSize = 1)
public class Asset {

    @Id
    @NotNull
    @Column(
            name = "id_asset",
            unique = true,
            nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceIdAsset")
    private Long id;

    @NotNull
    @Column(name = "tx_name")
    private String name;

    @NotNull
    @Column(name = "tx_acronym")
    private String acronym;

    @NotNull
    @Column(name = "tx_description")
    private String description;

    @NotNull
    @Column(name = "dt_walletDate")
    private Date walletDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_wallet")
    private Wallet wallet;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            targetEntity = Cotation.class,
            mappedBy = "asset",
            orphanRemoval = true)
    private List<Cotation> cotations;

}
