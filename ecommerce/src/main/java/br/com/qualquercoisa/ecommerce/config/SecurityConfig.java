package br.com.qualquercoisa.ecommerce.config;

import br.com.qualquercoisa.ecommerce.repository.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    // Serviço para buscar usuários no banco de dados
    @Bean
    public UserDetailsService userDetailsService(UsuarioRepository usuarioRepository) {
        return login -> usuarioRepository.findByLogin(login)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    // Configuração do PasswordEncoder (BCrypt é o recomendado pelo spring)
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Configuração do SecurityFilterChain para autenticação e autorização
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // Desabilitar CSRF para simplificar (habilite em produção)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/public/**").permitAll() // Permite acesso público a essa rota
                        .anyRequest().authenticated() // Qualquer outra rota requer autenticação
                )
                .httpBasic(); // Usar autenticação básica (prompt do navegador ou Postman)
        return http.build();
    }
}