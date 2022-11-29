package com.generation.lojagames.REPOSITORY;

import com.generation.lojagames.MODEL.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{
    public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);

    @Query("select e from Produto e where e.preco < :preco")
    List<Produto> findAllByPrecoIs(@Param("preco") BigDecimal preco);

}