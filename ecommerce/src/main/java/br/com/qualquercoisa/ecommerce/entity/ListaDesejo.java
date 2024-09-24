package br.com.qualquercoisa.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ListaDesejo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Produto produto;
}
