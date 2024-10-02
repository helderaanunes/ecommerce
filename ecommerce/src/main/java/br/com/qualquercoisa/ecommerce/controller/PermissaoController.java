package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.Cartao;
import br.com.qualquercoisa.ecommerce.entity.Permissao;
import br.com.qualquercoisa.ecommerce.repository.PermissaoRepository;
import br.com.qualquercoisa.ecommerce.service.CartaoService;
import br.com.qualquercoisa.ecommerce.service.PermissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PermissaoController {
    
    @Autowired
    private PermissaoService permissaoService;

//    @PostMapping("/permissao")
//    public ResponseEntity<Permissao> salvar(@RequestBody Permissao permissao){
//        return PermissaoService.salvar(permissao);
//    }

}
