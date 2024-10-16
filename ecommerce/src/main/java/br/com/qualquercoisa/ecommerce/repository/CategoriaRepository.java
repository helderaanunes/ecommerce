package br.com.qualquercoisa.ecommerce.repository;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository  extends CrudRepository<Categoria, Long> {

    @Query(nativeQuery = true, value="select categoria " +
            " where categoria.id = {idCategoria}")
    public List<Categoria> pegarSubCategorias(Long idCategoria);


}
