package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.ImagemProduto;
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

    public ResponseEntity<ImagemProduto> salvar(@RequestBody ImagemProduto ImagemProduto) {
        ImagemProduto imagemProdutojaSalva = imagemProdutoRepository.save(ImagemProduto);
        return new ResponseEntity<ImagemProduto>(imagemProdutojaSalva, HttpStatus.OK);
    }






}
