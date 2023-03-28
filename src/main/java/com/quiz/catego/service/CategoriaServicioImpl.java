package com.quiz.catego.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.catego.entity.Categoria;
import com.quiz.catego.repository.CategoriaRepositorio;

@Service
public class CategoriaServicioImpl implements CategoriaServicio {

    @Autowired
    CategoriaRepositorio repositorio;

    @Override
    public List<Categoria> listarCategorias() {
        return repositorio.findAll();
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) {
        return repositorio.save(categoria);
    }

    @Override
    public Categoria obtenerCategoria(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Categoria modificarCategoria(Categoria categoria) {
        return repositorio.save(categoria);
    }

    @Override
    public void eliminarCategoria(Long id) {
        repositorio.deleteById(id);
    }

}
