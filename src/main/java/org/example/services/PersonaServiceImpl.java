package org.example.services;

import org.example.entities.Persona;
import org.example.repositories.BaseRepository;
import org.example.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository){
        super(baseRepository);
    }


    @Override
    public List<Persona> search(String filtro) throws Exception {
        try{
            //List<Persona> personas= personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //List<Persona> personas=personaRepository.search(filtro);
            List<Persona> personas=personaRepository.searchNative(filtro);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Persona> personas= personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //Page<Persona> personas=personaRepository.search(filtro,pageable);
            //Page<Persona> personas=personaRepository.searchNative(filtro, pageable);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


}
