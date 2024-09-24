package br.com.qualquercoisa.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class HistoricoEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate dataHora;
    @ManyToOne
    private Entrega entrega;
    private String mensagem;
}
