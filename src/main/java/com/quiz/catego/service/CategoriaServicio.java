package com.quiz.catego.service;

import java.util.List;



import com.quiz.catego.entity.Categoria;


public interface CategoriaServicio {
    
    public List<Categoria> listarCategorias();

     public Categoria guardarCategoria(Categoria categoria);

     public Categoria obtenerCategoria(Long id);

     public Categoria modificarCategoria(Categoria categoria);

     public void eliminarCategoria(Long id);
}
