package br.com.qualquercoisa.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Data
public class Usuario implements UserDetails {

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

    private boolean ativo;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "usuario_permissao",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "permissao_id")
    )
    private Set<Permissao> permissao;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Converte as permissões associadas ao usuário para GrantedAuthority
        return permissao.stream()
                .map(permissao -> (GrantedAuthority) () -> permissao.getNome())
                .collect(Collectors.toSet());
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Define que a conta não está expirada
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Define que a conta não está bloqueada
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Define que as credenciais não estão expiradas
    }

    @Override
    public boolean isEnabled() {
        return ativo; // Retorna o estado "ativo" para habilitar/desabilitar o usuário
    }
}
