package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.AvaliacaoProduto;
import br.com.qualquercoisa.ecommerce.repository.AvaliacaoProdutoRepository;
import br.com.qualquercoisa.ecommerce.service.AvaliacaoProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvaliacaoProdutoController {

    @Autowired
    private AvaliacaoProdutoService avaliacaoProdutoService;

    @PostMapping("/avaliacaoproduto")
    public ResponseEntity<AvaliacaoProduto>salvar(@RequestBody AvaliacaoProduto avaliacaoProduto){
        return avaliacaoProdutoService.salvar(avaliacaoProduto);
    }
}
