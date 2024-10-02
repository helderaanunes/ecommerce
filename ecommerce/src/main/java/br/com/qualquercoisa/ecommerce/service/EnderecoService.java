package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Endereco;
import br.com.qualquercoisa.ecommerce.repository.EnderecoRepository;
import br.com.qualquercoisa.ecommerce.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public Iterable<Endereco> listarTodos (){
        return enderecoRepository.findAll();
    }

    public ResponseEntity<Endereco> salvar (Endereco endereco){
        return new ResponseEntity<Endereco>(enderecoRepository.save(endereco), HttpStatus.OK);
    }

    public ResponseEntity<Endereco> buscarPorId(Long id) {
        return new ResponseEntity<Endereco>(enderecoRepository.findById(id).orElseThrow(),HttpStatus.OK);
    }

    public ResponseEntity deletar(Long id) {
        enderecoRepository.deleteById(id);
        return new ResponseEntity("{\"mensagem\":\"Removido com sucesso\"}",HttpStatus.OK);
    }
}
