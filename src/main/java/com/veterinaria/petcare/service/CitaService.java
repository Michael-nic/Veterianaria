package com.veterinaria.petcare.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.veterinaria.petcare.entity.Cita;
import com.veterinaria.petcare.repository.CitaRepository;

@Service 
public class CitaService {

    private final CitaRepository citaRepository;

    public CitaService(CitaRepository citaRepository){
        this.citaRepository = citaRepository;
    }

    public List<Cita> getAll(){
        return citaRepository.findAll();
    }

    public Cita create(Cita cita){
        return citaRepository.save(cita);
    }

    

}
