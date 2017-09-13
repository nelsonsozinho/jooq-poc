package br.com.nalone.jooqpoc.wallet.vo.factory;

import br.com.nalone.jooqpoc.wallet.vo.WalletVO;

public class WalletVOFactory {

    private WalletVO vo  = null;


    private WalletVOFactory() {
        vo = new WalletVO();
    }

    public WalletVOFactory id(final Long id) {
        vo.setId(id);
        return this;
    }

    public WalletVOFactory name(final String name) {
        this.vo.setName(name);
        return this;
    }

   public WalletVOFactory description(final String description) {
        vo.setDescription(description);
        return this;
   }

   public WalletVO build() {
        WalletVO newVO = vo;
        vo = null;
        return newVO;
   }

   public static WalletVOFactory start() {
       return new WalletVOFactory();
   }

}
