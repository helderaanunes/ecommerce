package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.FluxoFinanceiro;
import br.com.qualquercoisa.ecommerce.repository.FluxoFinanceiroRepository;
import br.com.qualquercoisa.ecommerce.service.FluxoFinanceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class FluxoFinanceiroController {

    @Autowired
    private FluxoFinanceiroService fluxoFinanceiroService;

    @PostMapping("/fluxoFinanceiro")

    public ResponseEntity<FluxoFinanceiro> salvar (@RequestBody FluxoFinanceiro fluxoFinanceiro){
        return fluxoFinanceiroService.salvar(fluxoFinanceiro);

    }
}