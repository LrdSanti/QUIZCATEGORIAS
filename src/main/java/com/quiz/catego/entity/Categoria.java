package com.quiz.catego.entity;

 import jakarta.persistence.*;

 @Entity
 @Table(name="categorias")
 public class Categoria {
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long codigo;
     
     @Column(name="nomProducto", nullable = false, length = 100 )
     private String nomProducto;
     
     @Column(name="descripcion", nullable = false, length = 100 )
     private String descripcion;

    public Categoria() {
    }

    public Categoria(String nomProducto) {

        this.nomProducto = nomProducto;

    }

    public Categoria(Long codigo, String nomProducto, String descripcion) {
        this.codigo = codigo;
        this.nomProducto = nomProducto;
        this.descripcion = descripcion;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    


     
 }
