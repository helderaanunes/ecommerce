package br.com.qualquercoisa.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Cartao {
    @Id
    @GeneratedValue
    private Long id;
    private String numeroCartao;
    private String validade;
    private String nome;
    @ManyToOne
    private Cliente cliente;
}