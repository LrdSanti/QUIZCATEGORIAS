package com.quiz.catego.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.quiz.catego.entity.Categoria;
import com.quiz.catego.service.CategoriaServicio;

@Controller
public class CategoriaController {

    @Autowired
    private CategoriaServicio servicio;

    @GetMapping({ "/categorias", "/" })
    public String listarCategorias(Model modelo) {

        modelo.addAttribute("categorias", servicio.listarCategorias());

        return "categorias";
    }

    @GetMapping("/categorias/nuevo")
    public String mostrarFormularioDeRegistroCategoria(Model modelo) {

        Categoria categoria = new Categoria();

        modelo.addAttribute("categoria", categoria);
        return "registrar_categoria";

    }

    @PostMapping("/categorias")
    public String guardarCategoria(@ModelAttribute("categoria") Categoria categoria) {

        servicio.guardarCategoria(categoria);
        return "redirect:/categorias";
    }


    @GetMapping("/categorias/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {

        modelo.addAttribute("categoria", servicio.obtenerCategoria(id));

        return "editar_categoria";
    }
    
    @PostMapping("/categorias/{id}")
    public String actualizarCategorias(@PathVariable Long id, @ModelAttribute("categoria") Categoria categoria,
            Model modelo) {

        Categoria categoriaExistente = servicio.obtenerCategoria(id);
        categoriaExistente.setCodigo(id);
        categoriaExistente.setNomProducto(categoria.getNomProducto());
        categoriaExistente.setDescripcion(categoria.getDescripcion());
        
        servicio.modificarCategoria(categoriaExistente);

        return "redirect:/categorias";
    }

    @GetMapping("/categorias/{id}")
    public String eliminarCategoria(@PathVariable Long id) {
        servicio.eliminarCategoria(id);

        return "redirect:/categorias";
    }

}
