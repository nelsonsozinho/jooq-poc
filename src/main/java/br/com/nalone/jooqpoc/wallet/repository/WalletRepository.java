package br.com.nalone.jooqpoc.wallet.repository;


import br.com.nalone.jooqpoc.wallet.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(exported = false)
public interface WalletRepository extends JpaRepository<Wallet, Long> {



}
