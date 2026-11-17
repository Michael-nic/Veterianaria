package com.veterinaria.petcare.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.petcare.entity.Mascota;
import com.veterinaria.petcare.service.MascotaService;

@RestController 
@RequestMapping ("/api/mascotas")
@CrossOrigin (origins = "http://localhost:5173/",
        methods = { RequestMethod.GET, RequestMethod.POST
        })
public class MascotaController {

    private final MascotaService mascotaService;

    public MascotaController(MascotaService mascotaService){
        this.mascotaService = mascotaService;
    }

    @GetMapping
    public List<Mascota> getAll(){
        return mascotaService.getAll();
    }

    @PostMapping 
    public Mascota create(@RequestBody Mascota mascota){
        return mascotaService.create(mascota);
    }

}
