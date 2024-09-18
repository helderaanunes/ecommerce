package br.com.qualquercoisa.ecommerce.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
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
