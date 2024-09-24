package br.com.qualquercoisa.ecommerce.repository;

import br.com.qualquercoisa.ecommerce.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>
{
}
