package com.esig.examen.controller;

import com.esig.examen.modele.Salle;
import com.esig.examen.service.salles.SalleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salles")
public class SalleController {

    private final SalleService salleService;

    public SalleController(SalleService salleService) {
        this.salleService = salleService;
    }
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Salle create(@RequestBody Salle salle){
        return salleService.CreateSalle(salle);
    }
    @GetMapping("/read")
    public List<Salle> read(){
        return salleService.ReadSalle();
    }
    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.UPGRADE_REQUIRED)
    public Salle update(@PathVariable Long id, @RequestBody Salle salle){
        return salleService.UpdateSalle(id, salle);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return salleService.DeleteSalle(id);
    }
}
