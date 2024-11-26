package br.com.qualquercoisa.ecommerce;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class EcommerceApplication {
	public static void main(String[] args) {
		//System.out.println(new BCryptPasswordEncoder().encode("segredo123"));
		SpringApplication.run(EcommerceApplication.class, args);
	}
}