package com.veterinaria.petcare.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.petcare.entity.Dueno;
import com.veterinaria.petcare.service.DuenoService;

@RestController 
@RequestMapping ("/api/dueno/")
@CrossOrigin(
    origins = "http://localhost:5173",
    methods = {
        RequestMethod.GET,
        RequestMethod.POST,
        RequestMethod.PUT,
        RequestMethod.DELETE
    }
)
public class DuenoController {

    private final DuenoService duenoService;

    public DuenoController(DuenoService duenoService){
        this.duenoService = duenoService;
    }

    @GetMapping("getDuenoByID/{id}")
    public Dueno getDuenoById(@PathVariable Long id){
        return duenoService.getDuenoByID(id);
    }

    @GetMapping("getAllDuenos")
    public List<Dueno> getAllDuenos(){
        return duenoService.getAllDuenos();
    }
    
    @PostMapping 
    public Dueno creatDueno(@RequestBody Dueno dueno){
        return duenoService.creatDueno(dueno);
    }

    @PutMapping("/{id}")
    public Dueno updatedDueno(@PathVariable Long id, @RequestBody Dueno dueno) {
        return duenoService.updateDueno(id, dueno);
    }

    @DeleteMapping("/{id}")
    public void deleteDueno(@PathVariable Long id) {
        duenoService.deleteDueno(id);
    }

}
