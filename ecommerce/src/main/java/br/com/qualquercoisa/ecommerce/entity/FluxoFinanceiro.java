package br.com.qualquercoisa.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data

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
