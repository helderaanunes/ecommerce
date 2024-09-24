package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.ItemVenda;
import br.com.qualquercoisa.ecommerce.repository.ItemVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemVendaService {

    @Autowired
    private ItemVendaRepository itemVendaRepository;

    public List<ItemVenda> listarTodos() {
        return (List<ItemVenda>) itemVendaRepository.findAll();
    }

    public Optional<ItemVenda> buscarPorId(Long id) {
        return itemVendaRepository.findById(id);
    }

    public ItemVenda salvar(ItemVenda itemVenda) {
        return itemVendaRepository.save(itemVenda);
    }

//    public ItemVenda atualizar(Long id, ItemVenda itemVendaAtualizado) {
//        Optional<ItemVenda> itemVendaExistente = itemVendaRepository.findById(id);
//        if (itemVendaExistente.isPresent()) {
//            ItemVenda itemVenda = itemVendaExistente.get();
//            itemVenda.setQuantidade(itemVendaAtualizado.getQuantidade());
//            itemVenda.setPrecoUnitario(itemVendaAtualizado.getPrecoUnitario());
//            itemVenda.setProdutoEstoque(itemVendaAtualizado.getProdutoEstoque());
//            itemVenda.setEntrega(itemVendaAtualizado.getEntrega());
//            itemVenda.setVenda(itemVendaAtualizado.getVenda());
//            return itemVendaRepository.save(itemVenda);
//        } else {
//            throw new RuntimeException("Item de Venda não encontrado com o ID: " + id);
//        }
//    }

    public void deletar(Long id) {
        itemVendaRepository.deleteById(id);
    }
}
