package br.com.qualquercoisa.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Data
@Getter
@Setter
public class FluxoFinanceiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dataVencimento;
    private Date dataPagamento;
    private Float valor;
    private String descricao;
    private String fluxo;
//    @ManyToOne
//    private Venda venda;


}
