package com.example.back;

import com.example.back.entity.Biblioteca;
import com.example.back.entity.Libro;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LibroDto {

    private Long id;

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("autor")
    private String autor;

    @JsonProperty("biblioteca")
    private Biblioteca biblioteca;

    public LibroDto() {
    }

    public LibroDto(Long id, String nombre, String autor, Biblioteca biblioteca) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.biblioteca = biblioteca;
    }

    public LibroDto(Libro libro) {

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

