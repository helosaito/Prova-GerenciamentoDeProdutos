package com.example.GerenciamentoDeProdutos.models;

import com.example.GerenciamentoDeProdutos.enums.StatusProduto;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;


@Entity
@Table(name = "tb_produto")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome_Produto", nullable = false)
    private String nome;
    @Column(name = "Descricao_Produto")
    private String descricao;
    @Column(name = "Preco_Produto", nullable = false)
    private double preco;
    @Enumerated(EnumType.STRING)
    @Column(name = "Status_Produto", nullable = false)
    private StatusProduto status;

    public ProdutoModel() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public StatusProduto getStatus() {return status;}

    public void setStatus(StatusProduto status) {this.status = status;}
}