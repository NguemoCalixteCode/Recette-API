package com.example.recettes_api.DTOs;

import java.util.List;

public class RecetteDTO {
    private String nom;
    private String description;
    private String categorie;
    private List<IngredientDTO> ingredients;

    public RecetteDTO() {}

    public RecetteDTO(String nom, String description, String categorie, List<IngredientDTO> ingredients) {
        this.nom = nom;
        this.description = description;
        this.categorie = categorie;
        this.ingredients = ingredients;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public List<IngredientDTO> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientDTO> ingredients) {
        this.ingredients = ingredients;
    }
}
