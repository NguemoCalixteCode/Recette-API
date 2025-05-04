package com.example.recettes_api.services;

import com.example.recettes_api.entities.Recette;
import com.example.recettes_api.repositories.RecetteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecetteService {

    private final RecetteRepository recetteRepository;

    public RecetteService(RecetteRepository recetteRepository) {
        this.recetteRepository = recetteRepository;
    }

    public List<Recette> getAllRecettes() {
        return recetteRepository.findAll();
    }

    public Optional<Recette> getRecetteById(Long id) {
        return recetteRepository.findById(id);
    }

    public Recette createRecette(Recette recette) {
        return recetteRepository.save(recette);
    }

    public void deleteRecette(Long id) {
        recetteRepository.deleteById(id);
    }

    public List<Recette> searchRecettesByNom(String nom) {
        return recetteRepository.findByNomContainingIgnoreCase(nom);
    }

    public Recette updateRecette(Long id, Recette updatedRecette) {
        return recetteRepository.findById(id).map(recette -> {
            recette.setNom(updatedRecette.getNom());
            recette.setDescription(updatedRecette.getDescription());
            recette.setCategorie(updatedRecette.getCategorie());
            recette.setIngredients(updatedRecette.getIngredients());
            return recetteRepository.save(recette);
        }).orElseThrow(() -> new RuntimeException("Recette non trouvée avec l'id " + id));
    }


}
