package br.com.qualquercoisa.ecommerce.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    @ManyToOne
    private Cliente cliente;
}
