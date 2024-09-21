package br.com.qualquercoisa.ecommerce.repository;

import br.com.qualquercoisa.ecommerce.entity.Devolucao;
import br.com.qualquercoisa.ecommerce.entity.ProdutoEstoque;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevolucaoRepository extends CrudRepository<Devolucao, Long> {
}