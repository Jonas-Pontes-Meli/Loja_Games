package com.generation.lojagames.MODEL;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @NotBlank(message = "O nome do produto não pode ser vazio")
    @Size(min = 10, max = 100, message = "O nome do produto não pode ser menor que 3 caracteres e maior que 100")
    private String nome;
    @Size(min = 10, max = 200, message = "A descrição do produto não pode ser menor que 3 caracteres e maior que 100")
    private String descricao;
    private BigDecimal preco;
    @ManyToOne
    @JsonIgnoreProperties("produto")
    private Categoria categoria ;
    @ManyToOne
    @JsonIgnoreProperties("produto")
    private Usuario usuario ;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

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

}
