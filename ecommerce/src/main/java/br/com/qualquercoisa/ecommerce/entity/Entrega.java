package br.com.qualquercoisa.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private ItemVenda itemVenda ;
    private float quantidade;
    @ManyToOne
    private Transportadora transportadora;
    private String codigoRastreio;


}
