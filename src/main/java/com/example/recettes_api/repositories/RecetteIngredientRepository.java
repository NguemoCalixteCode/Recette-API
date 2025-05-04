package com.example.recettes_api.repositories;

import com.example.recettes_api.entities.RecetteIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetteIngredientRepository extends JpaRepository<RecetteIngredient, Long> {}
