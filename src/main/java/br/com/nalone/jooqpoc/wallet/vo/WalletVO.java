package br.com.nalone.jooqpoc.wallet.vo;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class WalletVO implements Serializable {

    private Long id;
    private String name;
    private String description;

}