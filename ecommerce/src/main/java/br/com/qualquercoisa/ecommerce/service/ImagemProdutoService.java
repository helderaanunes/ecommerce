package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.entity.ImagemProduto;
import br.com.qualquercoisa.ecommerce.repository.CategoriaRepository;
import br.com.qualquercoisa.ecommerce.repository.ImagemProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ImagemProdutoService {
    @Autowired
    private ImagemProdutoRepository imagemProdutoRepository;

    public Iterable<ImagemProduto> listarTodos (){

        return imagemProdutoRepository.findAll();
    }

    public ResponseEntity<ImagemProduto> salvar (ImagemProduto imagemProduto){
        return new ResponseEntity<ImagemProduto>(imagemProdutoRepository.save(imagemProduto), HttpStatus.OK);
    }

    public ResponseEntity<ImagemProduto> buscarPorId(Long id) {
        return new ResponseEntity<ImagemProduto>(imagemProdutoRepository.findById(id).orElseThrow(),HttpStatus.OK);
    }

    public ResponseEntity deletar(Long id) {
        imagemProdutoRepository.deleteById(id);
        return new ResponseEntity("{\"mensagem\":\"Removido com sucesso\"}",HttpStatus.OK);
    }
}
