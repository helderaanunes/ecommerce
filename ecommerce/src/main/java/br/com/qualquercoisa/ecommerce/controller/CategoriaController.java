package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.dto.CategoriaDTO;
import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.repository.CategoriaRepository;
import br.com.qualquercoisa.ecommerce.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/subcategorias/contar")
    public List<CategoriaDTO> getCategoriasContandoSubCategoria() {
        return categoriaService.getCategoriasContandoSubCategoria();
    }

    @PostMapping("/categoria")
    public ResponseEntity<?> salvar (@Valid @RequestBody Categoria categoria, BindingResult result){
        if (result.hasErrors()) {
            // Retorna os erros de validação
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }
        return categoriaService.salvar(categoria);
    }

    @GetMapping("/categoria")
    public Iterable<Categoria> listarTodos (){
        return categoriaService.listarTodos();
    }

    @GetMapping("/categoria/{id}")
    public ResponseEntity<Categoria> buscarPorId(@PathVariable Long id){
        return categoriaService.buscarPorId(id);
    }

    @DeleteMapping("/categoria/{id}")
    public ResponseEntity<Void> deletarCategoria(@PathVariable Long id) {
        categoriaService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/categoria/{id}")
    public ResponseEntity<Categoria> atualizar(
            @PathVariable Long id,
            @RequestBody Categoria categoria){
        categoria.setId(id);
        return categoriaService.salvar(categoria);
    }
}
