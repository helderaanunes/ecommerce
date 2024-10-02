package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Produto;
import br.com.qualquercoisa.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public ResponseEntity<Produto> salvar (@RequestBody Produto produto){
        Produto produtoJaSalva = produtoRepository.save(produto);
        return new ResponseEntity<Produto>(produtoJaSalva, HttpStatus.OK);

    }
}
