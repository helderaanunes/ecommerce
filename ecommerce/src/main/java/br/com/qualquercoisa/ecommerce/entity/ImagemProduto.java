package br.com.qualquercoisa.ecommerce.entity;

import jakarta.persistence.*;

@Entity
public class ImagemProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String enderecoArquivo;
    @ManyToOne
    private Produto produto;


}
