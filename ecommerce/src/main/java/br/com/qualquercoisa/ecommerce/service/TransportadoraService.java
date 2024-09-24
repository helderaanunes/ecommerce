package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Transportadora;
import br.com.qualquercoisa.ecommerce.repository.TransportadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public Transportadora salvar(Transportadora transportadora) {
        return transportadoraRepository.save(transportadora);
    }

    public Transportadora atualizar(Long id, Transportadora transportadoraAtualizada) {
        Optional<Transportadora> transportadoraExistente = transportadoraRepository.findById(id);
        if (transportadoraExistente.isPresent()) {
            Transportadora transportadora = transportadoraExistente.get();
            transportadora.setNome(transportadoraAtualizada.getNome());
            transportadora.setNumero(transportadoraAtualizada.getNumero());
            transportadora.setComplemento(transportadoraAtualizada.getComplemento());
            transportadora.setBairro(transportadoraAtualizada.getBairro());
            transportadora.setCidade(transportadoraAtualizada.getCidade());
            transportadora.setUf(transportadoraAtualizada.getUf());
            transportadora.setCep(transportadoraAtualizada.getCep());
            return transportadoraRepository.save(transportadora);
        } else {
            throw new RuntimeException("Transportadora não encontrada com o ID: " + id);
        }
    }

    public void deletar(Long id) {
        transportadoraRepository.deleteById(id);
    }
}
