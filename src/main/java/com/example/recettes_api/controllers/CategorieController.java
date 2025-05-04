package com.example.recettes_api.controllers;

import com.example.recettes_api.entities.Categorie;
import com.example.recettes_api.services.CategorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import com.example.recettes_api.DTOs.CategorieDTO;

@RestController
@RequestMapping("/categories")
public class CategorieController {

    private final CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }


    @GetMapping
    public List<CategorieDTO> getAllCategories() {
        return categorieService.getAllCategorieDTOs();
    }


    @PostMapping
    public Categorie createCategorie(@RequestBody CategorieDTO dto) {
        return categorieService.createCategorieFromDTO(dto);
    }


    @GetMapping("/{id}")
    public CategorieDTO getCategorieById(@PathVariable Long id) {
        return categorieService.getCategorieDTOById(id);
    }


    @PutMapping("/update/{id}")
    public CategorieDTO updateCategorie(@PathVariable Long id, @RequestBody CategorieDTO updatedCategorieDTO) {
        return categorieService.updateCategorie(id, updatedCategorieDTO);
    }


    @GetMapping("/search")
    public List<CategorieDTO> searchCategories(@RequestParam(name = "nom") String nom) {
        return categorieService.searchCategoriesByNom(nom);
    }






}
