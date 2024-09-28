package org.example.services;

import org.example.entities.Libro;
import org.example.repositories.BaseRepository;
import org.example.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService{
    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}
