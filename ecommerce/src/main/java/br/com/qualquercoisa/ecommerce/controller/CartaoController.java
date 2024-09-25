package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.Cartao;
import br.com.qualquercoisa.ecommerce.repository.CartaoRepository;
import br.com.qualquercoisa.ecommerce.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartaoController {

    @Autowired
    private CartaoService cartaoService;

    @PostMapping("/cartao")
    public ResponseEntity<Cartao> salvar(@RequestBody Cartao cartao){
        return cartaoService.salvar(cartao);
    }
}
