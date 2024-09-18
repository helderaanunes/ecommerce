package br.com.qualquercoisa.ecommerce.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AvaliacaoProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private ItemVenda itemVenda;
    private int nota;
    private String descricao;
}
