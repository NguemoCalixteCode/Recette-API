package com.example.recettes_api.services;

import com.example.recettes_api.entities.RecetteIngredient;
import com.example.recettes_api.repositories.RecetteIngredientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecetteIngredientService {

    private final RecetteIngredientRepository recetteIngredientRepository;

    public RecetteIngredientService(RecetteIngredientRepository recetteIngredientRepository) {
        this.recetteIngredientRepository = recetteIngredientRepository;
    }

    public List<RecetteIngredient> getAllRecetteIngredients() {
        return recetteIngredientRepository.findAll();
    }

    public RecetteIngredient create(RecetteIngredient recetteIngredient) {
        return recetteIngredientRepository.save(recetteIngredient);
    }
}
