package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.repository.CategoriaRepository;
import br.com.qualquercoisa.ecommerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping("/venda")
    public ResponseEntity<Venda> salvar(@REquestBody Venda venda){
        return  vendaService.salvar(venda);
    }

    @GetMapping("/venda")
    public Iterable<Venda> listarTodos(){
        return vendaService.listarTodos();
    }

    @GetMapping("/venda/{id}")
    public ResponseEntity<Venda> buscarPorId(@PathVariable Long id){
        return vendaService.buscarPorId(id);
    }

    @DeleteMapping("/venda/{id}")
    public ResponseEntity deletar(@PathVariable Long id){
        return vendaService.deletar(id);
    }

    @PutMapping("/venda/{id}")
    public ResponseEntity<Venda> atualizar(
            @PathVariable Long id,
            @RequestBody Venda venda){
        venda.setId(id);
        return vendaService.salvar(venda);
    }
}