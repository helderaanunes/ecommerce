package br.com.qualquercoisa.ecommerce.controller;

import br.com.qualquercoisa.ecommerce.entity.ItemVenda;
import br.com.qualquercoisa.ecommerce.entity.ListaDesejo;
import br.com.qualquercoisa.ecommerce.service.ItemVendaService;
import br.com.qualquercoisa.ecommerce.service.ListaDesejoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ListaDesejoController {

    @Autowired
    private ListaDesejoService listaDesejoService;

    @PostMapping("/listaDesejo")
    public ListaDesejo salvar(@RequestBody ListaDesejo listaDesejo){
        return listaDesejoService.salvar(listaDesejo);
    }

    @GetMapping("/listaDesejo")
    public Iterable<ListaDesejo> listarTodos (){
        return listaDesejoService.listarTodos();
    }

    @GetMapping("/listaDesejo/{id}")
    public Optional<ListaDesejo> buscarPorId(@PathVariable Long id){
        return listaDesejoService.buscarPorId(id);
    }

    @DeleteMapping("/listaDesejo/{id}")
    public ResponseEntity deletar(@PathVariable Long id){
        return listaDesejoService.deletar(id);
    }

    @PutMapping("/listaDesejo/{id}")
    public ListaDesejo atualizar(@PathVariable Long id, @RequestBody ListaDesejo listaDesejo){
        listaDesejo.setId(id);
        return listaDesejoService.salvar(listaDesejo);
    }
}
