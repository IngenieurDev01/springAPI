package com.esig.examen.controller;

import com.esig.examen.modele.Mariage;
import com.esig.examen.service.mariage.MariageService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mariages")
public class MariageController {
    private final MariageService mariageService;

    public MariageController(MariageService mariageService) {
        this.mariageService = mariageService;
    }
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Mariage create(@RequestBody Mariage mariage){
        return mariageService.CreateMariage(mariage);
    }
    @GetMapping("/read")
    public List<Mariage> read(){
        return mariageService.ReadMariage();
    }
    @PutMapping("/update/{id}")
    public Mariage update(@PathVariable Long id, @RequestBody Mariage mariage){
        return mariageService.UpdateMariage(id, mariage);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return mariageService.DeleteMariage(id);
    }
}
