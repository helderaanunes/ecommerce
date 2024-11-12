package br.com.qualquercoisa.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CategoriaDTO {
    private String nome;
    private Long numeroDeSubcategorias;
}
