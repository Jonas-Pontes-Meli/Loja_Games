package com.generation.lojagames.MODEL;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @NotBlank(message = "O nome não pode ser vazio")
    @Size(min = 10,max = 100)
    @Size(min = 3,max = 150, message = "O titulo não pode ser menor que 10 e maior que 150")
    private String titulo;

    @NotBlank(message = "A descrição ão pode ser vazio")
    @Size(min = 10,max = 200, message = "A descrição não pode ser menor que 10 e maior que 200")
    private String Descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
}
