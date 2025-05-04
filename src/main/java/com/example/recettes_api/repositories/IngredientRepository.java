package com.example.recettes_api.repositories;

import com.example.recettes_api.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    List<Ingredient> findByNomContainingIgnoreCase(String nom);
}
