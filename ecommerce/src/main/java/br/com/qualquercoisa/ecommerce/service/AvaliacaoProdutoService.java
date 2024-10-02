package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.AvaliacaoProduto;
import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.repository.AvaliacaoProdutoRepository;
import br.com.qualquercoisa.ecommerce.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AvaliacaoProdutoService {
    @Autowired
    private AvaliacaoProdutoRepository avaliacaoProdutoRepository;

    public Iterable<AvaliacaoProduto> listarTodos (){
        return avaliacaoProdutoRepository.findAll();
    }

    public ResponseEntity<AvaliacaoProduto> salvar (AvaliacaoProduto avaliacaoProduto){
        return new ResponseEntity<AvaliacaoProduto>(avaliacaoProdutoRepository.save(avaliacaoProduto), HttpStatus.OK);
    }

    public ResponseEntity<AvaliacaoProduto> buscarPorId(Long id) {
        return new ResponseEntity<AvaliacaoProduto>(avaliacaoProdutoRepository.findById(id).orElseThrow(),HttpStatus.OK);
    }

    public ResponseEntity deletar(Long id) {
        avaliacaoProdutoRepository.deleteById(id);
        return new ResponseEntity("{\"mensagem\":\"Removido com sucesso\"}",HttpStatus.OK);
    }
}
