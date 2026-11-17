package com.veterinaria.petcare.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.petcare.entity.Cita;
import com.veterinaria.petcare.service.CitaService;

@RestController 
@RequestMapping ("/api/categories")
@CrossOrigin (origins = "http://localhost:5173/",
        methods = { RequestMethod.GET, RequestMethod.POST
        })
public class CitaController {

    private final CitaService citaService;

    public CitaController(CitaService citaService){
        this.citaService = citaService;
    }

    @GetMapping 
    public List<Cita> getAll(){
        return citaService.getAll();
    }

    @PostMapping 
    public Cita create(@RequestBody Cita cita){
        return citaService.create(cita);
    }

}
