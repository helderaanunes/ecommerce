package br.com.qualquercoisa.ecommerce.repository;

import br.com.qualquercoisa.ecommerce.dto.CategoriaDTO;
import br.com.qualquercoisa.ecommerce.entity.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository  extends CrudRepository<Categoria, Long> {

    @Query(nativeQuery = true, value="select categoria " +
            " where categoria.id = {idCategoria}")
    public List<Categoria> pegarSubCategorias(Long idCategoria);


    @Query("SELECT c FROM Categoria c WHERE c.categoria.id = :parentId")
    List<Categoria> findSubcategoriasByParentId(@Param("parentId") Long parentId);

    @Query("SELECT new br.com.qualquercoisa.ecommerce.dto.CategoriaDTO(c.nome, COUNT(sc)) " +
            "FROM Categoria c LEFT JOIN c.categoria sc GROUP BY c.nome")
    List<CategoriaDTO> getCategoriasContandoSubCategoria();
}
