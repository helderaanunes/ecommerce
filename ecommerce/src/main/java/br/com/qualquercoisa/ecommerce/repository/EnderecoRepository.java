package br.com.qualquercoisa.ecommerce.repository;

import br.com.qualquercoisa.ecommerce.entity.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
}
