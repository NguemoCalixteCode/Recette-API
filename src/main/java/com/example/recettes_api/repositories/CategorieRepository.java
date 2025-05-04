package com.example.recettes_api.repositories;

import com.example.recettes_api.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    List<Categorie> findByNomContainingIgnoreCase(String nom);

}
