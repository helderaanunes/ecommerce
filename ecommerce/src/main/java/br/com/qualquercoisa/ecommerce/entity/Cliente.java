package br.com.qualquercoisa.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    private String login;
    private String senha;
    private String email;
    private String telefone;



}
