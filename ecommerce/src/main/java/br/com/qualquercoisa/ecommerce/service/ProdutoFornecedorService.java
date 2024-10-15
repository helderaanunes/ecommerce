package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.ProdutoFornecedor;
import br.com.qualquercoisa.ecommerce.repository.ProdutoFornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoFornecedorService {

    @Autowired
    private ProdutoFornecedorRepository produtoFornecedorRepository;

    public List<ProdutoFornecedor> listarTodos() {
        return (List<ProdutoFornecedor>) produtoFornecedorRepository.findAll();
    }

    public Optional<ProdutoFornecedor> buscarPorId(Long id) {
        return produtoFornecedorRepository.findById(id);
    }

    public ProdutoFornecedor salvar(ProdutoFornecedor produtoFornecedor) {
        return produtoFornecedorRepository.save(produtoFornecedor);
    }

    public ProdutoFornecedor atualizar(Long id, ProdutoFornecedor produtoFornecedorAtualizado) {
        Optional<ProdutoFornecedor> produtoFornecedorExistente = produtoFornecedorRepository.findById(id);
        if (produtoFornecedorExistente.isPresent()) {
            ProdutoFornecedor produtoFornecedor = produtoFornecedorExistente.get();
           // produtoFornecedor.setFornecedor(produtoFornecedorAtualizado.getFornecedor());
            produtoFornecedor.setProduto(produtoFornecedorAtualizado.getProduto());
            produtoFornecedor.setPrecoProduto(produtoFornecedorAtualizado.getPrecoProduto());
            return produtoFornecedorRepository.save(produtoFornecedor);
        } else {
            throw new RuntimeException("Produto de Fornecedor não encontrado com o ID: " + id);
        }
    }

    public ResponseEntity deletar(Long id) {
        produtoFornecedorRepository.deleteById(id);
        return new ResponseEntity("{\"mensagem\":\"Removido com sucesso\"}", HttpStatus.OK);
    }
}
