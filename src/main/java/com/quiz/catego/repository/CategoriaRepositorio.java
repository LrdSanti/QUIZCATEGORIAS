package com.quiz.catego.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.catego.entity.Categoria;

public interface CategoriaRepositorio extends JpaRepository <Categoria, Long> {
    
}
