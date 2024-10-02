package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.entity.Transportadora;
import br.com.qualquercoisa.ecommerce.repository.TransportadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransportadoraService {

    @Autowired
    private TransportadoraRepository transportadoraRepository;

    public Iterable<Transportadora> listarTodos (){
        return transportadoraRepository.findAll();
    }

    public ResponseEntity<Transportadora> salvar (Transportadora transportadora){
        return new ResponseEntity<Transportadora>(transportadoraRepository.save(transportadora), HttpStatus.OK);
    }

    public ResponseEntity<Transportadora> buscarPorId(Long id) {
        return new ResponseEntity<Transportadora>(transportadoraRepository.findById(id).orElseThrow(), HttpStatus.OK);
    }

    public ResponseEntity deletar(Long id) {
        transportadoraRepository.deleteById(id);
        return new ResponseEntity("{\"mensagem\":\"Removido com sucesso\"}", HttpStatus.OK);
    }
}
