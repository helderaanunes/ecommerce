package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.ListaDesejo;
import br.com.qualquercoisa.ecommerce.repository.ListaDesejoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListaDesejoService {

    @Autowired
    private ListaDesejoRepository listaDesejoRepository;

    public List<ListaDesejo> listarTodos() {
        return (List<ListaDesejo>) listaDesejoRepository.findAll();
    }

    public Optional<ListaDesejo> buscarPorId(Long id) {
        return listaDesejoRepository.findById(id);
    }

    public ListaDesejo salvar(ListaDesejo listaDesejo) {
        return listaDesejoRepository.save(listaDesejo);
    }

    public ListaDesejo atualizar(Long id, ListaDesejo listaDesejoAtualizado) {
        Optional<ListaDesejo> listaDesejoExistente = listaDesejoRepository.findById(id);
        if (listaDesejoExistente.isPresent()) {
            ListaDesejo listaDesejo = listaDesejoExistente.get();
            listaDesejo.setCliente(listaDesejoAtualizado.getCliente());
            listaDesejo.setProduto(listaDesejoAtualizado.getProduto());
            return listaDesejoRepository.save(listaDesejo);
        } else {
            throw new RuntimeException("Item da Lista de Desejos não encontrado com o ID: " + id);
        }
    }

    public ResponseEntity deletar(Long id) {
        listaDesejoRepository.deleteById(id);
        return new ResponseEntity("{\"mensagem\":\"Removido com sucesso\"}", HttpStatus.OK);
    }
}
