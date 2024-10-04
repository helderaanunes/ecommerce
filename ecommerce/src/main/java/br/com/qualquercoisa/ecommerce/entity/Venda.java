package br.com.qualquercoisa.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate data;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Endereco enderecoEntrega;
}