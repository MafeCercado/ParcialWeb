package com.example.back.service;

import com.example.back.dto.LibroDto;
import com.example.back.repository.LibroRepository;
import com.example.back.entity.Libro;
import org.jvnet.hk2.annotations.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibroService {

    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<LibroDto> listar() {
        List<Libro> libros = libroRepository.findAll();
        return libros.stream().map(LibroDto::new).collect(Collectors.toList());
    }

    public LibroDto guardar(LibroDto libroDto) {
        Libro libro = new Libro();
        libro.setNombre(libroDto.getNombre());
        libro.setAutor(libroDto.getAutor());
        libro.setBiblioteca(libroDto.getBiblioteca());
        libroRepository.save(libro);
        return new LibroDto(libro.getId(), libro.getNombre(), libro.getAutor(), libro.getBiblioteca());
    }

    public void eliminar(Long id) {
        libroRepository.deleteById(id);
    }

}
