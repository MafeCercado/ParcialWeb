package com.example.back.controller;

import com.example.back.dto.LibroDto;
import com.example.back.service.LibroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @GetMapping
    public List<LibroDto> listar() {
        return libroService.listar();
    }

    @PostMapping
    public LibroDto guardar(@RequestBody LibroDto libroDto) {
        return libroService.guardar(libroDto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        libroService.eliminar(id);
    }

}
