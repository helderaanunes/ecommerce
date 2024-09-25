package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.HistoricoEntrega;
import br.com.qualquercoisa.ecommerce.repository.HistoricoEntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class HistoricoEntregaService {

    @Autowired
    private HistoricoEntregaRepository historicoEntregaRepository;

    public ResponseEntity<HistoricoEntrega> salvar(HistoricoEntrega historicoEntrega) {
        HistoricoEntrega historicoEntregaJaSalva = historicoEntregaRepository.save(historicoEntrega);
        return new ResponseEntity<HistoricoEntrega>(historicoEntregaJaSalva, HttpStatus.OK);
    }
}
