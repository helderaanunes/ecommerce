package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.repository.CategoriaRepository;
import br.com.qualquercoisa.ecommerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/categoria")
    public ResponseEntity<Categoria> salvar (@RequestBody Categoria categoria){
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
    public ResponseEntity deletar(@PathVariable Long id){
        return categoriaService.deletar(id);
    }

    @PutMapping("/categoria/{id}")
    public ResponseEntity<Categoria> atualizar(
            @PathVariable Long id,
            @RequestBody Categoria categoria){
        categoria.setId(id);
        return categoriaService.salvar(categoria);
    }
}
