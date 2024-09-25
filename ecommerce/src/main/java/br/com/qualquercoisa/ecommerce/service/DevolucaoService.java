package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Devolucao;
import br.com.qualquercoisa.ecommerce.repository.DevolucaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service

public class DevolucaoService {
    @Autowired
    private DevolucaoRepository devolucaoRepository;

    public ResponseEntity<Devolucao> salvar( Devolucao devolucao) {
        Devolucao devolucaoJaSalva = devolucaoRepository.save(devolucao);
        return new ResponseEntity<Devolucao>(devolucaoJaSalva, HttpStatus.OK);

    }

}
