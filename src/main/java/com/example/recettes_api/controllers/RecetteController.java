package com.example.recettes_api.controllers;

import com.example.recettes_api.entities.Recette;
import com.example.recettes_api.services.RecetteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/recettes")
public class RecetteController {

    private final RecetteService recetteService;

    public RecetteController(RecetteService recetteService) {
        this.recetteService = recetteService;
    }

    @GetMapping
    public List<Recette> getAllRecettes() {
        return recetteService.getAllRecettes();
    }

    @GetMapping("/{id}")
    public Optional<Recette> getRecetteById(@PathVariable Long id) {
        return recetteService.getRecetteById(id);
    }

    @PostMapping
    public Recette createRecette(@RequestBody Recette recette) {
        return recetteService.createRecette(recette);
    }

    @DeleteMapping("/{id}")
    public void deleteRecette(@PathVariable Long id) {
        recetteService.deleteRecette(id);
    }

    @GetMapping("/search")
    public List<Recette> searchRecettes(@RequestParam(name = "nom") String nom) {
        return recetteService.searchRecettesByNom(nom);
    }

    @PutMapping("/update/{id}")
    public Recette updateRecette(@PathVariable Long id, @RequestBody Recette updatedRecette) {
        return recetteService.updateRecette(id, updatedRecette);
    }



}
