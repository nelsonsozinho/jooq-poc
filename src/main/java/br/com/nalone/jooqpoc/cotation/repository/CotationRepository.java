package br.com.nalone.jooqpoc.cotation.repository;

import br.com.nalone.jooqpoc.cotation.model.Cotation;
import br.com.nalone.jooqpoc.wallet.model.Investor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface CotationRepository extends JpaRepository<Cotation, Long> {

}
