package com.example.recettes_api.repositories;

import com.example.recettes_api.entities.Recette;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecetteRepository extends JpaRepository<Recette, Long> {
    List<Recette> findByNomContainingIgnoreCase(String nom);
}
