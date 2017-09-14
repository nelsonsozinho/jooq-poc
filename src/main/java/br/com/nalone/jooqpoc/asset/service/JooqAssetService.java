package br.com.nalone.jooqpoc.asset.service;

import br.com.nalone.jooqpoc.asset.vo.AssetVO;
import br.com.nalone.jooqpoc.asset.vo.factory.AssetVOFactory;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static br.com.nalone.jooqpoc.core.domain.jooq.Tables.TB_ASSET;
import static br.com.nalone.jooqpoc.core.domain.jooq.Tables.TB_WALLET;

@Service
public class JooqAssetService {

    @Autowired
    private DSLContext dslContext;

    public List<AssetVO> listAssetsByWalletId(final Long walletId) {
        final List<Record> records = dslContext.select()
                .from(TB_ASSET)
                .innerJoin(TB_WALLET)
                .on(TB_WALLET.ID_WALLET.eq(TB_ASSET.ID_WALLET))
                .where(TB_WALLET.ID_WALLET.eq(walletId))
                .fetch();

        return converterRecordsToVoList(records);
    }

    private List<AssetVO> converterRecordsToVoList(final List<Record> records) {
        final List<AssetVO> vos = new ArrayList<>();

        if(records.isEmpty())
            return Collections.emptyList();

        records.stream().forEach(record -> {
            AssetVO vo = AssetVOFactory.start()
                .id(record.getValue(TB_ASSET.ID_ASSET))
                .name(record.getValue(TB_ASSET.TX_NAME))
                .description(record.getValue(TB_ASSET.TX_DESCRIPTION))
                .walletDate(record.getValue(TB_ASSET.DT_WALLET_DATE))
                .build();
            vos.add(vo);
        });

        return vos;
    }

}
