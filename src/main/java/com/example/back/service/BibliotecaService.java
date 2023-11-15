package com.example.back.service;

import com.example.back.entity.Biblioteca;
import com.example.back.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecaService {

    @Autowired
    private BibliotecaRepository bibliotecaRepository;

    public List<Biblioteca> listar() {
        return bibliotecaRepository.findAll();
    }

    public Biblioteca guardar(Biblioteca biblioteca) {
        return bibliotecaRepository.save(biblioteca);
    }

    public void eliminar(Long id) {
        bibliotecaRepository.deleteById(id);
    }

}
