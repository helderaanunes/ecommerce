package br.com.qualquercoisa.ecommerce.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    private String login;
    private String senha;
    private String email;
    private String telefone;
    @ManyToOne
    private Permissao permissao;
}
