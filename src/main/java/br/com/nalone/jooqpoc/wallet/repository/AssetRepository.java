package br.com.nalone.jooqpoc.wallet.repository;

import br.com.nalone.jooqpoc.wallet.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface AssetRepository extends JpaRepository<Asset, Long> {

}
