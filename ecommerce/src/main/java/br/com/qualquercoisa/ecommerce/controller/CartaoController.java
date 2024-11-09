package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.Cartao;
import br.com.qualquercoisa.ecommerce.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CartaoController {

    @Autowired
    private CartaoService cartaoService;

    @PostMapping("/cartao")
    public ResponseEntity<Cartao> salvar(@RequestBody Cartao cartao){
        return cartaoService.salvar(cartao);
    }

    @GetMapping("/cartao")
    public Iterable<Cartao> listarTodos(){
        return cartaoService.listarTodos();
    }

    @GetMapping("/cartao/{id}")
    public ResponseEntity<Cartao> buscarPorId(@PathVariable Long id){
        return cartaoService.buscarPorId(id);
    }

    @DeleteMapping("/cartao/{id}")
    public ResponseEntity deletar(@PathVariable Long id){
        return cartaoService.deletar(id);
    }

    @PutMapping("/cartao/{id}")
    public ResponseEntity<Cartao> atualizar(
            @PathVariable Long id,
            @RequestBody Cartao cartao){
        cartao.setId(id);
        return cartaoService.salvar(cartao);
    }
}
