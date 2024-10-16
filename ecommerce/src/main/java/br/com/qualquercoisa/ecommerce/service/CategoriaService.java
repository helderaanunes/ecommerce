package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.repository.CategoriaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Iterable<Categoria> listarTodos (){
        return categoriaRepository.findAll();
    }

    public ResponseEntity<Categoria> salvar (Categoria categoria){
        return new ResponseEntity<Categoria>(categoriaRepository.save(categoria), HttpStatus.OK);
    }

    public ResponseEntity<Categoria> buscarPorId(Long id) {
        return new ResponseEntity<Categoria>(categoriaRepository.findById(id).orElseThrow(),HttpStatus.OK);
    }

    @Transactional
    public void deletar(Long id) {
        // Buscar a categoria que deseja deletar


        return new ResponseEntity<Categoria>(categoria, HttpStatus.OK);
    }
}
