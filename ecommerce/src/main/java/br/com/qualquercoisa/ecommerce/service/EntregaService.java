package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Entrega;
import br.com.qualquercoisa.ecommerce.repository.EntregaRepository;
import br.com.qualquercoisa.ecommerce.repository.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EntregaService {
    @Autowired
    private EntregaRepository entregaRepository;

    public ResponseEntity<Entrega> salvar(Entrega entrega) {
        Entrega entregaJaSalva = entregaRepository.save(entrega);
        return new ResponseEntity<Entrega>(entregaJaSalva, HttpStatus.OK);
    }

}