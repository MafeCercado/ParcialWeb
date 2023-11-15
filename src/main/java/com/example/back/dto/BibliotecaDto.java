package com.example.back.dto;

import com.example.back.entity.Biblioteca;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BibliotecaDto {

    private Long id;
    private String nombre;
    private String ciudad;
    private String direccion;

    public BibliotecaDto(Biblioteca biblioteca) {
        this.id = biblioteca.getId();
        this.nombre = biblioteca.getNombre();
        this.ciudad = biblioteca.getCiudad();
        this.direccion = biblioteca.getDireccion();
    }

}
