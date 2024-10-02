package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
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

    public Iterable<FluxoFinanceiro> listarTodos (){
        return fluxoFinanceiroRepository.findAll();
    }

    public ResponseEntity<FluxoFinanceiro> salvar (FluxoFinanceiro fluxoFinanceiro){
        return new ResponseEntity<FluxoFinanceiro>(fluxoFinanceiroRepository.save(fluxoFinanceiro), HttpStatus.OK);
    }

    public ResponseEntity<FluxoFinanceiro> buscarPorId(Long id) {
        return new ResponseEntity<FluxoFinanceiro>(fluxoFinanceiroRepository.findById(id).orElseThrow(),HttpStatus.OK);
    }

    public ResponseEntity deletar(Long id) {
        fluxoFinanceiroRepository.deleteById(id);
        return new ResponseEntity("{\"mensagem\":\"Removido com sucesso\"}",HttpStatus.OK);
    }




}
