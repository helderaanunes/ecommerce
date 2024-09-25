package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.HistoricoEntrega;
import br.com.qualquercoisa.ecommerce.repository.HistoricoEntregaRepository;
import br.com.qualquercoisa.ecommerce.service.HistoricoEntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistoricoEntregaController {

    @Autowired
    private HistoricoEntregaService historicoEntregaService;

    @PostMapping("/historico-entrega")
    public ResponseEntity<HistoricoEntrega> salvar(@RequestBody HistoricoEntrega historicoEntrega) {
        return historicoEntregaService.salvar(historicoEntrega);
    }
}
