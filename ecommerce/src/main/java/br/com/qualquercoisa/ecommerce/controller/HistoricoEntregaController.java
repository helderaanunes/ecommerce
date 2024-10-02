package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.entity.HistoricoEntrega;
import br.com.qualquercoisa.ecommerce.repository.HistoricoEntregaRepository;
import br.com.qualquercoisa.ecommerce.service.HistoricoEntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HistoricoEntregaController {

    @Autowired
    private HistoricoEntregaService historicoEntregaService;

    @PostMapping("/historico-entrega")
    public ResponseEntity<HistoricoEntrega> salvar(@RequestBody HistoricoEntrega historicoEntrega) {
        return historicoEntregaService.salvar(historicoEntrega);
    }

    ////
    @GetMapping("/historico-entrega")
    public Iterable<HistoricoEntrega> listarTodos (){
        return historicoEntregaService.listarTodos();
    }

    @GetMapping("/historico-entrega/{id}")
    public ResponseEntity<HistoricoEntrega> buscarPorId(@PathVariable Long id){
        return historicoEntregaService.buscarPorId(id);
    }

    @DeleteMapping("/historico-entrega/{id}")
    public ResponseEntity deletar(@PathVariable Long id){
        return historicoEntregaService.deletar(id);
    }

    @PutMapping("/historico-entrega/{id}")
    public ResponseEntity<HistoricoEntrega> atualizar(
            @PathVariable Long id,
            @RequestBody HistoricoEntrega historicoEntrega){
        historicoEntrega.setId(id);
        return historicoEntregaService.salvar(historicoEntrega);
    }
}
