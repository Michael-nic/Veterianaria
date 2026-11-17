package com.veterinaria.petcare.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.veterinaria.petcare.entity.Mascota;
import com.veterinaria.petcare.repository.MascotaRepository;

@Service 
public class MascotaService {

    private final MascotaRepository mascotaRepository;

    public MascotaService(MascotaRepository mascotaRepository){
        this.mascotaRepository = mascotaRepository;
    }

    public List<Mascota> getAll(){
        return mascotaRepository.findAll();
    }

    public Mascota create(Mascota mascota){
        return mascotaRepository.save(mascota);
    }
    


}
