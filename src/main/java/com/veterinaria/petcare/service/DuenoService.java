package com.veterinaria.petcare.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.veterinaria.petcare.entity.Dueno;
import com.veterinaria.petcare.repository.DuenoRepository;

@Service 
public class DuenoService {
    
    private final DuenoRepository duenoRepository;

    public DuenoService(DuenoRepository duenoRepository){
        this.duenoRepository = duenoRepository;
    }

    public List<Dueno> getAllDuenos(){
        return duenoRepository.findAll();
    }

    public Dueno getDuenoByID(Long id){
        return duenoRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(
                        HttpStatus.NOT_FOUND
                )
                );
    }

    public Dueno creatDueno(Dueno dueno){
        return duenoRepository.save(dueno);
    }

    public Dueno updateDueno(Long id, Dueno updateDueno){
        Dueno existingDueno = getDuenoByID(id);

        existingDueno.setRut(updateDueno.getRut());
        existingDueno.setNombre(updateDueno.getNombre());
        
        return duenoRepository.save(existingDueno);
    }

    public void deleteDueno(Long id){
        Dueno existingDueno = getDuenoByID(id);
        duenoRepository.delete(existingDueno);
    }
}
