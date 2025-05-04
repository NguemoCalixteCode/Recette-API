package com.example.recettes_api.entities;

import jakarta.persistence.*;

@Entity
public class RecetteIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Recette recette;

    @ManyToOne
    private Ingredient ingredient;

    private double quantite;
    private String unite;

    public RecetteIngredient() {}

    public RecetteIngredient(Recette recette, Ingredient ingredient, double quantite, String unite) {
        this.recette = recette;
        this.ingredient = ingredient;
        this.quantite = quantite;
        this.unite = unite;
    }

    public Long getId() {
        return id;
    }

    public Recette getRecette() {
        return recette;
    }

    public void setRecette(Recette recette) {
        this.recette = recette;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
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
