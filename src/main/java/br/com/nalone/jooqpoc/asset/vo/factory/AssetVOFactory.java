package br.com.nalone.jooqpoc.asset.vo.factory;

import br.com.nalone.jooqpoc.asset.vo.AssetVO;

import java.util.Date;

public class AssetVOFactory {

    private AssetVO vo  = null;


    private AssetVOFactory() {
        vo = new AssetVO();
    }

    public AssetVOFactory id(final Long id) {
        vo.setId(id);
        return this;
    }

    public AssetVOFactory name(final String name) {
        this.vo.setName(name);
        return this;
    }

    public AssetVOFactory description(final String description) {
        vo.setDescription(description);
        return this;
    }

    public AssetVOFactory walletDate(final Date walletDate) {
        vo.setWalletDate(walletDate);
        return this;
    }

    public AssetVO build() {
        AssetVO newVO = vo;
        vo = null;
        return newVO;
    }

    public static AssetVOFactory start() {
        return new AssetVOFactory();
    }
}
