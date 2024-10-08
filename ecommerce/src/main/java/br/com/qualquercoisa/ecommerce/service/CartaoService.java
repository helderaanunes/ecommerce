package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Cartao;
import br.com.qualquercoisa.ecommerce.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    public Iterable<Cartao> listarTodos() {
        return cartaoRepository.findAll();
    }

    public ResponseEntity<Cartao> salvar(Cartao cartao) {
        return new ResponseEntity<>(cartaoRepository.save(cartao), HttpStatus.OK);
    }

    public ResponseEntity<Cartao> buscarPorId(Long id) {
        return new ResponseEntity<>(cartaoRepository.findById(id).orElseThrow(), HttpStatus.OK);
    }

    public ResponseEntity<String> deletar(Long id) {
        cartaoRepository.deleteById(id);
        return new ResponseEntity<>("{\"mensagem\":\"Removido com sucesso\"}", HttpStatus.OK);
    }
}
