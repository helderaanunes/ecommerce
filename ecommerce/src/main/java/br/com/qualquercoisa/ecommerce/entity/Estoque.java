package br.com.qualquercoisa.ecommerce.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Estoque {
    private long id;
    private String nome;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
}
