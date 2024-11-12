package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.dto.CategoriaDTO;
import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.repository.CategoriaRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Iterable<Categoria> listarTodos (){
        return categoriaRepository.findAll();
    }

    public List<CategoriaDTO> getCategoriasContandoSubCategoria() {
        return categoriaRepository.getCategoriasContandoSubCategoria();
    }

    public ResponseEntity<Categoria> salvar(Categoria categoria) {
        if (categoria.getCategoria() != null && categoria.getCategoria().getId() != null) {
            Optional<Categoria> categoriaPai = categoriaRepository.findById(categoria.getCategoria().getId());
            categoriaPai.ifPresent(categoria::setCategoria);
        }
        else{
            categoria.setCategoria(null);
        }
        return new ResponseEntity<Categoria>(categoriaRepository.save(categoria), HttpStatus.CREATED);
    }

    public ResponseEntity<Categoria> buscarPorId(Long id) {
        return new ResponseEntity<Categoria>(categoriaRepository.findById(id).orElseThrow(),HttpStatus.OK);
    }

    @Transactional
    public void deletar(Long id) {
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Categoria não encontrada com o ID " + id));
        removerSubcategorias(categoria);
        categoriaRepository.delete(categoria);
    }

    private void removerSubcategorias(Categoria categoria) {
        List<Categoria> subcategorias = categoriaRepository.findSubcategoriasByParentId(categoria.getId());
        for (Categoria subcategoria : subcategorias) {
            removerSubcategorias(subcategoria);
        }
        // Após remover todas as subcategorias, exclui a categoria atual
        categoriaRepository.delete(categoria);
    }
}
