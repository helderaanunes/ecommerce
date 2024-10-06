package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public ResponseEntity<List<Venda>> listarTodos(){
        List<Venda> vendas = vendaRepository.findAll();
        return new ResponseEntity<>(vendas, HttpStatus.OK);
    }

    public ResponseEntity<Venda> salvar(Venda venda){
        Venda novaVenda = vendaRepository.save(venda);
        return new ResponseEntity<>(novaVenda, HttpStatus.CREATED);
    }

    public ResponseEntity<Venda> buscarPorId(Long Id){
        Venda venda = vendaRepository.findById(id).orEkseThorow();
        return new ResponseEntity<>(venda, HttpStatus.OK)
    }

    public ResponseEntity<Venda> atualizar(Long id, Venda vendaAtualizada){
        Venda vendaExistente = vendaRepository.findById(id).orElseThrow();

        vendaExistente.setData(vendaAtualizada.getData());
        vendaExistente.setCliente(vendaAtualizada.getCliente());
        vendaExistente.setEnderecoEntrega(vendaAtualizada.getEnderecoEntrega());

        Venda vendaSalva = vendaRepository.save(vendaExistente);
        return new ResponseEntity<>(vendaSalva, HttpStatus.OK);
    }

    public ResponseEntity<String> deletar(Long id){
        vendaRepository.deleteById(id);
        return new ResponseEntity<>("{\"mensagem\":\"Venda removida com sucesso\"}", HttpStatus.OK)
    }
}