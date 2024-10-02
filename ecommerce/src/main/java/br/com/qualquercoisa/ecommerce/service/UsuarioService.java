package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Usuario;
import br.com.qualquercoisa.ecommerce.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public ResponseEntity<Usuario> salvar (Usuario usuario){
        Usuario usuarioJaSalva = usuarioRepository.save(usuario);
        return new ResponseEntity<Usuario>(usuarioJaSalva, HttpStatus.OK);
    }
}
