package com.example.recettes_api.DTOs;

public class RecetteIngredientDTO {
    private String nomIngredient;
    private double quantite;
    private String unite;

    public RecetteIngredientDTO() {}

    public RecetteIngredientDTO(String nomIngredient, double quantite, String unite) {
        this.nomIngredient = nomIngredient;
        this.quantite = quantite;
        this.unite = unite;
    }

    public String getNomIngredient() {
        return nomIngredient;
    }

    public void setNomIngredient(String nomIngredient) {
        this.nomIngredient = nomIngredient;
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
