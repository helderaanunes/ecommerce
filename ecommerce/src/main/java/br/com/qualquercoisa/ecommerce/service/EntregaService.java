package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Entrega;
import br.com.qualquercoisa.ecommerce.entity.Entrega;
import br.com.qualquercoisa.ecommerce.repository.EntregaRepository;
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

    public Iterable<Entrega> listarTodos (){
        return entregaRepository.findAll();
    }

    public ResponseEntity<Entrega> salvar (Entrega entrega){
        return new ResponseEntity<Entrega>(entregaRepository.save(entrega), HttpStatus.OK);
    }

    public ResponseEntity<Entrega> buscarPorId(Long id) {
        return new ResponseEntity<Entrega>(entregaRepository.findById(id).orElseThrow(),HttpStatus.OK);
    }

    public ResponseEntity deletar(Long id) {
        entregaRepository.deleteById(id);
        return new ResponseEntity("{\"mensagem\":\"Removido com sucesso\"}",HttpStatus.OK);
    }

}