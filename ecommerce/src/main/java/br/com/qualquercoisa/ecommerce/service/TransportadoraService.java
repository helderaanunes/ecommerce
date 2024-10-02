package br.com.qualquercoisa.ecommerce.service;

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

    public List<Transportadora> listarTodas() {

        return (List<Transportadora>) transportadoraRepository.findAll();
    }

    public Optional<Transportadora> buscarPorId(Long id) {

        return transportadoraRepository.findById(id);
    }

    public ResponseEntity<Transportadora> salvar(Transportadora transportadora) {

        return new ResponseEntity<Transportadora>(transportadoraRepository.save(transportadora), HttpStatus.OK);
    }

//    public Transportadora atualizar(Long id, Transportadora transportadoraAtualizada) {
//        transportadoraAtualizada.setId(id);
//        transportadoraRepository.save(transportadoraAtualizada);
//    }

    public void deletar(Long id) {
        transportadoraRepository.deleteById(id);
    }
}
