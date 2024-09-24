package br.com.qualquercoisa.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ItemVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Float quantidade;
    private Float precoUnitario;
    @ManyToOne
    private ProdutoEstoque produtoEstoque;
    @ManyToOne
    private Entrega entrega;
//    @ManyToOne
//    private Venda venda;
}
