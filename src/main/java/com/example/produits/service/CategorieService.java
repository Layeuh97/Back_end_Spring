package com.example.produits.service;

import com.example.produits.entities.Categorie;
import com.example.produits.entities.Produit;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategorieService {
    Categorie saveCategorie(Categorie c);

    Categorie updateCategorie(Categorie categorie);

    Categorie getCategorie(Long id);

    List<Categorie> findAllCategories();


    void deleteCategorieById(Long id);
}
