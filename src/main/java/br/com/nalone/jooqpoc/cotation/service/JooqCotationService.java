package br.com.nalone.jooqpoc.cotation.service;

import br.com.nalone.jooqpoc.wallet.vo.WalletVO;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JooqCotationService {

    @Autowired
    private DSLContext dslContext;

    public WalletVO getPersonalWalletByUserId(final Long userId) {


        return null;
    }

}
