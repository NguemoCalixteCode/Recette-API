package com.example.recettes_api.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Recette {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;

    @ManyToOne
    private Categorie categorie;

    @OneToMany(mappedBy = "recette", cascade = CascadeType.ALL)
    private List<RecetteIngredient> ingredients;

    public Recette() {}

    public Recette(String nom, String description, Categorie categorie, List<RecetteIngredient> ingredients) {
        this.nom = nom;
        this.description = description;
        this.categorie = categorie;
        this.ingredients = ingredients;
    }

    public Long getId() {
        return id;
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

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<RecetteIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<RecetteIngredient> ingredients) {
        this.ingredients = ingredients;
    }
}
