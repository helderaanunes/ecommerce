package br.com.qualquercoisa.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoEstoqueRepository extends CrudRepository<ProdutoEstoqueRepository, Long> {
}
