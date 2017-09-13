package br.com.nalone.jooqpoc.wallet.service;

import br.com.nalone.jooqpoc.wallet.vo.WalletVO;
import br.com.nalone.jooqpoc.wallet.vo.factory.WalletVOFactory;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static br.com.nalone.jooqpoc.core.domain.jooq.Tables.TB_INVESTOR;
import static br.com.nalone.jooqpoc.core.domain.jooq.Tables.TB_WALLET;

@Service
public class JooqWalletService {

    @Autowired
    private DSLContext dslContext;

    public WalletVO getPersonalWalletByUserId(final Long userId) {
        final Record personalWallet = dslContext.select()
                .from(TB_WALLET)
                .join(TB_INVESTOR)
                .on(TB_INVESTOR.ID_INVESTOR.eq(TB_WALLET.ID_INVESTOR))
                .fetchAny();

        final WalletVO vo = WalletVOFactory.start()
                .id(personalWallet.getValue(TB_WALLET.ID_WALLET))
                .name(personalWallet.getValue(TB_WALLET.TX_NAME))
                .description(personalWallet.getValue(TB_WALLET.TX_DESCRIPTION))
                .build();

        return vo;
    }

}
