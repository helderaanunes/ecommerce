package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.Devolucao;
import br.com.qualquercoisa.ecommerce.repository.DevolucaoRepository;
import br.com.qualquercoisa.ecommerce.service.DevolucaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevolucaoController {

    @Autowired
    private DevolucaoService devolucaoService;

    @PostMapping ("/Devolucao")
    public ResponseEntity<Devolucao> salvar(@RequestBody Devolucao devolucao){
        return devolucaoService.salvar(devolucao);
    }





}
