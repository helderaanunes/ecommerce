package br.com.qualquercoisa.ecommerce.repository;
import br.com.qualquercoisa.ecommerce.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}