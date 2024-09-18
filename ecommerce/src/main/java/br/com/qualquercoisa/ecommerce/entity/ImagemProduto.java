package br.com.qualquercoisa.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ImagemProduto {
    @Id
    @GeneratedValue
    private long id;
    private String enderecoArquivo;
    @ManyToOne
    private Produto produto;


}
