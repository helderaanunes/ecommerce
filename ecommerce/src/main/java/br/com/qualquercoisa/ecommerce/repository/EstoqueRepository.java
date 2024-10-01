package br.com.qualquercoisa.ecommerce.repository;
import br.com.qualquercoisa.ecommerce.entity.Estoque;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends CrudRepository <Estoque,Long> {
}
