package com.example.recettes_api.DTOs;

public class IngredientDTO {
    private String nom;
    private double quantite;
    private String unite;

    public IngredientDTO() {}

    public IngredientDTO(String nom, double quantite, String unite) {
        this.nom = nom;
        this.quantite = quantite;
        this.unite = unite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }
}
