package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.AvaliacaoProduto;
import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.repository.AvaliacaoProdutoRepository;
import br.com.qualquercoisa.ecommerce.service.AvaliacaoProdutoService;
import br.com.qualquercoisa.ecommerce.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AvaliacaoProdutoController {

    @Autowired
    private AvaliacaoProdutoService avaliacaoProdutoService;

    @PostMapping("/avaliacaoproduto")
    public ResponseEntity<AvaliacaoProduto> salvar (@RequestBody AvaliacaoProduto avaliacaoProduto){
        return avaliacaoProdutoService.salvar(avaliacaoProduto);
    }

    @GetMapping("/avaliacaoproduto")
    public Iterable<AvaliacaoProduto> listarTodos (){
        return avaliacaoProdutoService.listarTodos();
    }

    @GetMapping("/avaliacaoproduto/{id}")
    public ResponseEntity<AvaliacaoProduto> buscarPorId(@PathVariable Long id){
        return avaliacaoProdutoService.buscarPorId(id);
    }

    @DeleteMapping("/avaliacaoproduto/{id}")
    public ResponseEntity deletar(@PathVariable Long id){
        return avaliacaoProdutoService.deletar(id);
    }

    @PutMapping("/avaliacaoproduto/{id}")
    public ResponseEntity<AvaliacaoProduto> atualizar(
            @PathVariable Long id,
            @RequestBody AvaliacaoProduto avaliacaoProduto){
        avaliacaoProduto.setId(id);
        return avaliacaoProdutoService.salvar(avaliacaoProduto);
    }
}
