package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.FluxoFinanceiro;
import br.com.qualquercoisa.ecommerce.repository.FluxoFinanceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service

public class FluxoFinanceiroService {
    @Autowired
    private FluxoFinanceiroRepository fluxoFinanceiroRepository;

    public ResponseEntity<FluxoFinanceiro> salvar (FluxoFinanceiro fluxoFinanceiro){
        FluxoFinanceiro fluxoFinanceiroJaSalva = fluxoFinanceiroRepository.save(fluxoFinanceiro);
        return new ResponseEntity<FluxoFinanceiro>(fluxoFinanceiroJaSalva, HttpStatus.OK);
    }

}
