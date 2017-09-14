package br.com.nalone.jooqpoc.cotation.vo;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class CotationVO implements Serializable {

    private Long id;
    private Double value;
    private Date update;

}