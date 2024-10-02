package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.ItemVenda;
import br.com.qualquercoisa.ecommerce.entity.ProdutoFornecedor;
import br.com.qualquercoisa.ecommerce.service.ItemVendaService;
import br.com.qualquercoisa.ecommerce.service.ProdutoFornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProdutoFornecedorController {

    @Autowired
    private ProdutoFornecedorService produtoFornecedorService;

    @PostMapping("/produtoFornecedor")
    public ProdutoFornecedor salvar(@RequestBody ProdutoFornecedor produtoFornecedor){
        return produtoFornecedorService.salvar(produtoFornecedor);
    }

    @GetMapping("/produtoFornecedor")
    public Iterable<ProdutoFornecedor> listarTodos (){
        return produtoFornecedorService.listarTodos();
    }

    @GetMapping("/produtoFornecedor/{id}")
    public Optional<ProdutoFornecedor> buscarPorId(@PathVariable Long id){
        return produtoFornecedorService.buscarPorId(id);
    }

    @DeleteMapping("/produtoFornecedor/{id}")
    public ResponseEntity deletar(@PathVariable Long id){
        return produtoFornecedorService.deletar(id);
    }

    @PutMapping("/produtoFornecedor/{id}")
    public ProdutoFornecedor atualizar(@PathVariable Long id, @RequestBody ProdutoFornecedor produtoFornecedor){
        produtoFornecedor.setId(id);
        return produtoFornecedorService.salvar(produtoFornecedor);
    }
    
}
