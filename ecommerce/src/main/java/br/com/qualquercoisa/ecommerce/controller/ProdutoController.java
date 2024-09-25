package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.Produto;
import br.com.qualquercoisa.ecommerce.repository.ProdutoRepository;
import br.com.qualquercoisa.ecommerce.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

   @Autowired
   private ProdutoService produtoService;

    @PostMapping("/produto")
    public ResponseEntity<Produto> salvar (@RequestBody Produto produto){

        return produtoService.salvar(produto);

    }
}
