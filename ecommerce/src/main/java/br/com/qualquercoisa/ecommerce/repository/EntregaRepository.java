package br.com.qualquercoisa.ecommerce.repository;

import br.com.qualquercoisa.ecommerce.entity.Entrega;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository extends CrudRepository<Entrega, Long> {
}
