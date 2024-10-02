package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.ProdutoEstoque;
import br.com.qualquercoisa.ecommerce.entity.ProdutoFornecedor;
import br.com.qualquercoisa.ecommerce.service.ProdutoEstoqueService;
import br.com.qualquercoisa.ecommerce.service.ProdutoFornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProdutoEstoqueController {

    @Autowired
    private ProdutoEstoqueService produtoEstoqueService;

    @PostMapping("/produtoEstoque")
    public ProdutoEstoque salvar(@RequestBody ProdutoEstoque produtoEstoque){
        return produtoEstoqueService.salvar(produtoEstoque);
    }

    @GetMapping("/produtoEstoque")
    public Iterable<ProdutoEstoque> listarTodos (){
        return produtoEstoqueService.listarTodos();
    }

    @GetMapping("/produtoEstoque/{id}")
    public Optional<ProdutoEstoque> buscarPorId(@PathVariable Long id){
        return produtoEstoqueService.buscarPorId(id);
    }

    @DeleteMapping("/produtoEstoque/{id}")
    public ResponseEntity deletar(@PathVariable Long id){
        return produtoEstoqueService.deletar(id);
    }

    @PutMapping("/produtoEstoque/{id}")
    public ProdutoEstoque atualizar(@PathVariable Long id, @RequestBody ProdutoEstoque produtoEstoque){
        produtoEstoque.setId(id);
        return produtoEstoqueService.salvar(produtoEstoque);
    }
    
}
