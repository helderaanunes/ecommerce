package br.com.qualquercoisa.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date data;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Endereco enderecoEntrega;
}