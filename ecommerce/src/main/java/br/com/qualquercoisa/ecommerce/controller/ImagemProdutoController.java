package br.com.qualquercoisa.ecommerce.controller;
import br.com.qualquercoisa.ecommerce.entity.ImagemProduto;
import br.com.qualquercoisa.ecommerce.repository.ImagemProdutoRepository;
import br.com.qualquercoisa.ecommerce.service.ImagemProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImagemProdutoController {

    @Autowired
   private ImagemProdutoService imagemProdutoService;

    @PostMapping("/imagemproduto")
    public ResponseEntity<ImagemProduto> salvar(@RequestBody ImagemProduto ImagemProduto) {
        return imagemProdutoService.salvar(ImagemProduto);
    }


}
