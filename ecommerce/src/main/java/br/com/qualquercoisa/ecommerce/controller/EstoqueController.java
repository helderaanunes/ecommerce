package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.Estoque;
import br.com.qualquercoisa.ecommerce.repository.EstoqueRepository;
import br.com.qualquercoisa.ecommerce.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstoqueController {

    @Autowired
    private EstoqueService estoqueService;

    @PostMapping("/estoque")
    public ResponseEntity<Estoque> salvar (@RequestBody Estoque estoque) {
        return estoqueService.salvar(estoque);

    }



}
