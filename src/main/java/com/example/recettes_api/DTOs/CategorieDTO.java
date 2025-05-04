package com.example.recettes_api.DTOs;

public class CategorieDTO {
    private String nom;

    public CategorieDTO() {}

    public CategorieDTO(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
