package br.com.qualquercoisa.ecommerce.entity;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToOne
    private String cpf;
    private String rg;
    private String login;
    private String senha;
    private String email;
    private String telefone;
    private permissao Permissao;
}
