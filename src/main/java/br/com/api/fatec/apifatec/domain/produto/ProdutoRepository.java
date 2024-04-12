package br.com.api.fatec.apifatec.domain.produto;

import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import br.com.api.fatec.apifatec.entities.Produto;

public class ProdutoRepository extends JpaRepository<Produto, Long > {

}
