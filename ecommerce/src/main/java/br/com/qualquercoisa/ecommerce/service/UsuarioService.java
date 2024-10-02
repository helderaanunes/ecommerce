package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Usuario;
import br.com.qualquercoisa.ecommerce.entity.Usuario;
import br.com.qualquercoisa.ecommerce.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public ResponseEntity<Usuario> salvar (Usuario usuario){
        return new ResponseEntity<Usuario>(usuarioRepository.save(usuario), HttpStatus.OK);
    }

    public Iterable<Usuario> listarTodos (){
        return usuarioRepository.findAll();
    }
    public ResponseEntity<Usuario> buscarPorId(Long id) {
        return new ResponseEntity<Usuario>(usuarioRepository.findById(id).orElseThrow(),HttpStatus.OK);
    }

    public ResponseEntity deletar(Long id) {
        usuarioRepository.deleteById(id);
        return new ResponseEntity("{\"mensagem\":\"Removido com sucesso\"}",HttpStatus.OK);
    }
}
