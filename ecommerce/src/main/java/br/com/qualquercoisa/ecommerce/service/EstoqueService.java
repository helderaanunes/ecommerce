package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Estoque;
import br.com.qualquercoisa.ecommerce.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service


public class EstoqueService {

    @Autowired
    private EstoqueRepository estoqueRepository;


    public ResponseEntity<Estoque> salvar (Estoque estoque) {
        Estoque estoqueJaSalva = estoqueRepository.save(estoque);
        return new ResponseEntity<Estoque>(estoqueJaSalva, HttpStatus.OK);



    }



}
