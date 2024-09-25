package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.entity.Transportadora;
import br.com.qualquercoisa.ecommerce.repository.TransportadoraRepository;
import br.com.qualquercoisa.ecommerce.service.TransportadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransportadoraController {

    @Autowired
    private TransportadoraService transportadoraService;

    @PostMapping("/transportadora")
    public ResponseEntity<Transportadora> salvar(@RequestBody Transportadora transportadora){
        return transportadoraService.salvar(transportadora);
    }

}
