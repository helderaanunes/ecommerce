package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public ResponseEntity<Categoria> salvar (Categoria categoria){
        Categoria categoriaJaSalva = categoriaRepository.save(categoria);
        return new ResponseEntity<Categoria>(categoriaJaSalva, HttpStatus.OK);
    }

}
