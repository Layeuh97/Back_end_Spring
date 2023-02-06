package com.example.produits.service;

import com.example.produits.entities.Categorie;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategorieServiceImpl implements CategorieService{
    @Autowired
    private CategorieService categorieService;

    @Override
    public Categorie saveCategorie(Categorie c) {
        return categorieService.saveCategorie(c);
    }

    @Override
    public Categorie updateCategorie(Categorie categorie) {
        return null;
    }

    @Override
    public Categorie getCategorie(Long id) {
        return null;
    }

    @Override
    public List<Categorie> findAllCategories() {
        return categorieService.findAllCategories();
    }

    @Override
    public void deleteCategorieById(Long id) {

    }
}
