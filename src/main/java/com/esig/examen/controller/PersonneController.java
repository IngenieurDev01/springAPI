package com.esig.examen.controller;

import com.esig.examen.modele.Personne;
import com.esig.examen.service.personne.PersonneService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/personnes")
public class PersonneController {
    private final PersonneService personneService;

    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Personne create(@RequestBody Personne personne){
        return personneService.CreatePersonne(personne);
    }
    @GetMapping("/read")
    public List<Personne> read(){
        return personneService.ReadPersonne();
    }
    @PutMapping("/update/{id}")
    public Personne update(@PathVariable Long id, @RequestBody Personne personne){
        return personneService.UpdatePersonne(id, personne);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return personneService.DeletePersonne(id);
    }
}
