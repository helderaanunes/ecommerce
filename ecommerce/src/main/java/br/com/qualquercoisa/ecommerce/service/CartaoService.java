package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Cartao;
import br.com.qualquercoisa.ecommerce.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CartaoService {
    @Autowired
    private CartaoRepository cartaoRepository;

    public ResponseEntity<Cartao> salvar(Cartao cartao){
        return new ResponseEntity<Cartao>(cartaoRepository.save(cartao), HttpStatus.OK);
    }
}