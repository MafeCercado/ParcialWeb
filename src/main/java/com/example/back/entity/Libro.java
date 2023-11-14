package com.example.back.entity;

import jakarta.persistence.*;

@Entity

@Table(name = "Libro1899")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String autor;

    @ManyToOne
    @JoinColumn(name = "Biblioteca1899")
    private Biblioteca biblioteca;

    public Libro() {
    }

    public Libro(String nombre, String autor, Biblioteca biblioteca) {
        this.nombre = nombre;
        this.autor = autor;
        this.biblioteca = biblioteca;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
}
