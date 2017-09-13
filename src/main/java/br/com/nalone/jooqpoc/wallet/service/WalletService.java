package br.com.nalone.jooqpoc.wallet.service;

import br.com.nalone.jooqpoc.wallet.model.Investor;
import br.com.nalone.jooqpoc.wallet.model.Wallet;
import br.com.nalone.jooqpoc.wallet.repository.InvestorRepository;
import br.com.nalone.jooqpoc.wallet.repository.WalletRepository;
import br.com.nalone.jooqpoc.wallet.vo.WalletVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class WalletService {

    @Autowired
    private WalletRepository walletRepository;

    @Autowired
    private InvestorRepository investorRepository;

    @Transactional
    public void newWallet(final Long investorId, final WalletVO walletVO) {
        Investor investor = investorRepository.findOne(investorId);

        Wallet wallet = new Wallet();
        wallet.setDescription(walletVO.getDescription());
        wallet.setInvestor(investor);
        wallet.setName(walletVO.getName());

        walletRepository.save(wallet);
    }

    public WalletVO getWallet(final Long userId) {
        WalletVO walletVO = null;
        Investor investor = investorRepository.findOne(userId);

        if(investor != null) {
            Wallet wallet = investor.getWallet();
            walletVO = new WalletVO();
            walletVO.setId(wallet.getId());
            walletVO.setDescription(wallet.getDescription());
        }

        return walletVO;
    }

}
