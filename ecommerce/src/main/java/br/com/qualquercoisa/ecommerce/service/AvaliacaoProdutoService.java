package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.AvaliacaoProduto;
import br.com.qualquercoisa.ecommerce.repository.AvaliacaoProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AvaliacaoProdutoService {
    @Autowired
    private AvaliacaoProdutoRepository avaliacaoProdutoRepository;

    public ResponseEntity<AvaliacaoProduto> salvar(@RequestBody AvaliacaoProduto avaliacaoProduto){
        AvaliacaoProduto avaliacaoJaSalva = avaliacaoProdutoRepository.save(avaliacaoProduto);
        return new ResponseEntity<AvaliacaoProduto>(avaliacaoJaSalva, HttpStatus.OK);
    }
}
