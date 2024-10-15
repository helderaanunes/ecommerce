package br.com.qualquercoisa.ecommerce.service;

import br.com.qualquercoisa.ecommerce.entity.Categoria;
import br.com.qualquercoisa.ecommerce.entity.FluxoFinanceiro;
import br.com.qualquercoisa.ecommerce.entity.ProdutoFornecedor;
import br.com.qualquercoisa.ecommerce.repository.FluxoFinanceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class FluxoFinanceiroService {

    @Autowired
    private FluxoFinanceiroRepository fluxoFinanceiroRepository;

    public List<FluxoFinanceiro> listarTodos() {
        return (List<FluxoFinanceiro>) fluxoFinanceiroRepository.findAll();
    }

    public Optional<FluxoFinanceiro> buscarPorId(Long id) {

        return fluxoFinanceiroRepository.findById(id);
    }

    public FluxoFinanceiro salvar(FluxoFinanceiro fluxoFinanceiro) {
        return fluxoFinanceiroRepository.save(fluxoFinanceiro);
    }

    public FluxoFinanceiro atualizar(Long id, FluxoFinanceiro fluxoFinanceiroAtualizado) {
        Optional<FluxoFinanceiro> fluxoFinanceiroExistente = fluxoFinanceiroRepository.findById(id);
        if (fluxoFinanceiroExistente.isPresent()) {
            FluxoFinanceiro fluxoFinanceiro = fluxoFinanceiroExistente.get();
            fluxoFinanceiro.setDataVencimento(fluxoFinanceiroAtualizado.getDataVencimento());
            fluxoFinanceiro.setDataPagamento(fluxoFinanceiroAtualizado.getDataPagamento());
            fluxoFinanceiro.setValor(fluxoFinanceiroAtualizado.getValor());
            fluxoFinanceiro.setDescricao(fluxoFinanceiroAtualizado.getDescricao());
            fluxoFinanceiro.setFluxo(fluxoFinanceiroAtualizado.getFluxo());
            return fluxoFinanceiroRepository.save(fluxoFinanceiro);
        } else {
            throw new RuntimeException("Fluxo não encontrado com o ID: " + id);
        }
    }

    public ResponseEntity deletar(Long id) {
        fluxoFinanceiroRepository.deleteById(id);
        return new ResponseEntity("{\"mensagem\":\"Removido com sucesso\"}",HttpStatus.OK);
    }


}
