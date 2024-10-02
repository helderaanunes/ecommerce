package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.entity.FluxoFinanceiro;
import br.com.qualquercoisa.ecommerce.repository.FluxoFinanceiroRepository;
import br.com.qualquercoisa.ecommerce.service.FluxoFinanceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController


public class FluxoFinanceiroController {

    @Autowired
    private FluxoFinanceiroService fluxoFinanceiroService;

    @PostMapping("/fluxoFinanceiro")

    public ResponseEntity<FluxoFinanceiro> salvar (@RequestBody FluxoFinanceiro fluxoFinanceiro){
        return fluxoFinanceiroService.salvar(fluxoFinanceiro);

    }

    @GetMapping("/fluxoFinanceiro")
    public Iterable<FluxoFinanceiro> listarTodos (){
        return fluxoFinanceiroService.listarTodos();
    }

    @GetMapping("/fluxoFinanceiro/{id}")
    public ResponseEntity<FluxoFinanceiro> buscarPorId(@PathVariable Long id){
        return fluxoFinanceiroService.buscarPorId(id);
    }

    @DeleteMapping("/fluxoFinanceiro/{id}")
    public ResponseEntity deletar(@PathVariable Long id){
        return fluxoFinanceiroService.deletar(id);
    }

    @PutMapping("/fluxoFinanceiro/{id}")
    public ResponseEntity<FluxoFinanceiro> atualizar(
            @PathVariable Long id,
            @RequestBody FluxoFinanceiro fluxoFinanceiro){
        fluxoFinanceiro.setId(id);
        return fluxoFinanceiroService.salvar(fluxoFinanceiro);
    }


}