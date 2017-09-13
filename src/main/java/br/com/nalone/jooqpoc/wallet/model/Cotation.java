package br.com.nalone.jooqpoc.wallet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tb_cotation")
@SequenceGenerator(
        name = "sequenceIdCotation",
        sequenceName = "cotation_id_cotation_seq",
        allocationSize = 1)
public class Cotation {

    @Id
    @NotNull
    @Column(
            name = "id_cotation",
            unique = true,
            nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceIdCotation")
    private Long id;

    @NotNull
    @Column(name = "db_value")
    private Double value;

    @NotNull
    @Column(name = "dt_uptade")
    private Date update;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_asset")
    private Asset asset;


}
