package br.com.qualquercoisa.ecommerce.repository;

import br.com.qualquercoisa.ecommerce.entity.Venda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends CrudRepository<Venda, Long> {
}
