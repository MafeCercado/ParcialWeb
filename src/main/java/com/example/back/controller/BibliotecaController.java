package com.example.back.controller;

import com.example.back.entity.Biblioteca;
import com.example.back.service.BibliotecaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecas")
public class BibliotecaController {

    private final BibliotecaService bibliotecaService;

    public BibliotecaController(BibliotecaService bibliotecaService) {
        this.bibliotecaService = bibliotecaService;
    }

    @GetMapping
    public List<Biblioteca> listar() {
        return bibliotecaService.listar();
    }

    @PostMapping
    public Biblioteca guardar(@RequestBody Biblioteca biblioteca) {
        return bibliotecaService.guardar(biblioteca);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        bibliotecaService.eliminar(id);
    }

}
