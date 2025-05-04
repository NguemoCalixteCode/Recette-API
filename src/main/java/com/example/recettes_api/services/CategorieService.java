package com.example.recettes_api.services;

import com.example.recettes_api.entities.Categorie;
import com.example.recettes_api.repositories.CategorieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.example.recettes_api.DTOs.CategorieDTO;
import java.util.stream.Collectors;


@Service
public class CategorieService {

    private final CategorieRepository categorieRepository;

    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }

    public List<CategorieDTO> getAllCategorieDTOs() {
        return categorieRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .toList();
    }

    public Optional<Categorie> getCategorieById(Long id) {
        return categorieRepository.findById(id);
    }

    public CategorieDTO getCategorieDTOById(Long id) {
        Categorie categorie = categorieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Catégorie non trouvée avec l'id " + id));
        return convertToDTO(categorie);
    }

    public Categorie createCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    public Categorie updateCategorie(Long id, Categorie updatedCategorie) {
        Categorie categorie = categorieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Catégorie non trouvée avec l'id " + id));
        categorie.setNom(updatedCategorie.getNom());
        return categorieRepository.save(categorie);
    }


    public CategorieDTO convertToDTO(Categorie categorie) {
        return new CategorieDTO(categorie.getNom());
    }

    public Categorie createCategorieFromDTO(CategorieDTO dto) {
        Categorie categorie = new Categorie();
        categorie.setNom(dto.getNom());
        return categorieRepository.save(categorie);
    }

    public CategorieDTO updateCategorie(Long id, CategorieDTO updatedDTO) {
        Categorie categorie = categorieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Catégorie non trouvée avec l'id " + id));

        categorie.setNom(updatedDTO.getNom());
        categorieRepository.save(categorie);

        return new CategorieDTO(categorie.getNom());
    }

    public List<CategorieDTO> searchCategoriesByNom(String nom) {
        return categorieRepository.findByNomContainingIgnoreCase(nom)
                .stream()
                .map(c -> new CategorieDTO(c.getNom()))
                .collect(Collectors.toList());
    }





}
