package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.entity.Devolucao;
import br.com.qualquercoisa.ecommerce.repository.CategoriaRepository;
import br.com.qualquercoisa.ecommerce.repository.DevolucaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DevolucaoService {
    @Autowired
    private DevolucaoRepository devolucaoRepository;

    public Iterable<Devolucao> listarTodos (){
        return devolucaoRepository.findAll();
    }

    public ResponseEntity<Devolucao> salvar (Devolucao Devolucao){
        return new ResponseEntity<Devolucao>(devolucaoRepository.save(Devolucao), HttpStatus.OK);
    }

    public ResponseEntity<Devolucao> buscarPorId(Long id) {
        return new ResponseEntity<Devolucao>(devolucaoRepository.findById(id).orElseThrow(),HttpStatus.OK);
    }

    public ResponseEntity deletar(Long id) {
        devolucaoRepository.deleteById(id);
        return new ResponseEntity("{\"mensagem\":\"Removido com sucesso\"}",HttpStatus.OK);
    }

}
