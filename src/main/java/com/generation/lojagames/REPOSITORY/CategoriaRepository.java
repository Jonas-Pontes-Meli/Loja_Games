package com.generation.lojagames.REPOSITORY;

import com.generation.lojagames.MODEL.Categoria;
import com.generation.lojagames.MODEL.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoriaRepository extends JpaRepository <Categoria,Long> {
    public List<Categoria> findAllByTituloContainingIgnoreCase(@Param("titulo")String titulo);
}
