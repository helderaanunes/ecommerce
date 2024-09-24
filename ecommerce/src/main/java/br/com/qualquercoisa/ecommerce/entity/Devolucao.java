package br.com.qualquercoisa.ecommerce.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Devolucao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private ItemVenda itemVenda;
    private Float quantidade;
    private String codigoCorreios;


}
