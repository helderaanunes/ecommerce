package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
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
        return new ResponseEntity<HistoricoEntrega>(historicoEntregaRepository.save(historicoEntrega), HttpStatus.OK);
    }

    //////
    public Iterable<HistoricoEntrega> listarTodos() {
        return historicoEntregaRepository.findAll();
    }

    public ResponseEntity<HistoricoEntrega> buscarPorId(Long id) {
        return new ResponseEntity<HistoricoEntrega>(historicoEntregaRepository.findById(id).orElseThrow(),HttpStatus.OK);
    }

    public ResponseEntity deletar(Long id) {
        historicoEntregaRepository.deleteById(id);
        return new ResponseEntity("{\"mensagem\":\"Removido com sucesso\"}",HttpStatus.OK);
    }
}
