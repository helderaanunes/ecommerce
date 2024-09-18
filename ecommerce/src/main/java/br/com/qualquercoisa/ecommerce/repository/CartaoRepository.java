package br.com.qualquercoisa.ecommerce.repository;

import br.com.qualquercoisa.ecommerce.entity.Cartao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoRepository extends CrudRepository<Cartao, Long> {
}
