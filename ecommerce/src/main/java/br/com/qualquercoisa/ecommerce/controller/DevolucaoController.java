package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.entity.Devolucao;
import br.com.qualquercoisa.ecommerce.repository.DevolucaoRepository;
import br.com.qualquercoisa.ecommerce.service.CategoriaService;
import br.com.qualquercoisa.ecommerce.service.DevolucaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DevolucaoController {

    @Autowired
    private DevolucaoService devolucaoService;

    @PostMapping("/devolucao")
    public ResponseEntity<Devolucao> salvar (@RequestBody Devolucao devolucao){
        return devolucaoService.salvar(devolucao);
    }

    @GetMapping("/devolucao")
    public Iterable<Devolucao> listarTodos (){
        return devolucaoService.listarTodos();
    }

    @GetMapping("/devolucao/{id}")
    public ResponseEntity<Devolucao> buscarPorId(@PathVariable Long id){
        return devolucaoService.buscarPorId(id);
    }

    @DeleteMapping("/devolucao/{id}")
    public ResponseEntity deletar(@PathVariable Long id){
        return devolucaoService.deletar(id);
    }

    @PutMapping("/devolucao/{id}")
    public ResponseEntity<Devolucao> atualizar(
            @PathVariable Long id,
            @RequestBody Devolucao devolucao){
        devolucao.setId(id);
        return devolucaoService.salvar(devolucao);
    }





}
