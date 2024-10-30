package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.Estoque;
import br.com.qualquercoisa.ecommerce.entity.Estoque;
//import br.com.qualquercoisa.ecommerce.repository.EstoqueRepository;
import br.com.qualquercoisa.ecommerce.service.EstoqueService;
import br.com.qualquercoisa.ecommerce.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstoqueController {

    @Autowired
    private EstoqueService estoqueService;

    @PostMapping("/estoque")
    public ResponseEntity<Estoque> salvar (@RequestBody Estoque estoque){
        return estoqueService.salvar(estoque);
    }

    @GetMapping("/estoque")
    public Iterable<Estoque> listarTodos (){
        return estoqueService.listarTodos();
    }

    @GetMapping("/estoque/{id}")
    public ResponseEntity<Estoque> buscarPorId(@PathVariable Long id){
        return estoqueService.buscarPorId(id);
    }

    @DeleteMapping("/estoque/{id}")
    public ResponseEntity deletar(@PathVariable Long id){
        return estoqueService.deletar(id);
    }

    @PutMapping("/estoque/{id}")
    public ResponseEntity<Estoque> atualizar(
            @PathVariable Long id,
            @RequestBody Estoque estoque){
        estoque.setId(id);
        return estoqueService.salvar(estoque);
    }


}
