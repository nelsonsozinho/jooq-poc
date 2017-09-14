package br.com.nalone.jooqpoc.asset.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class AssetVO implements Serializable {

    private Long id;
    private String name;
    private String description;
    private Date walletDate;


}
