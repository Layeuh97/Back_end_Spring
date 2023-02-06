package com.example.produits.restcontrollers;

import com.example.produits.entities.Categorie;
import com.example.produits.entities.Produit;
import com.example.produits.repos.CategorieRepository;
import com.example.produits.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cat")
@CrossOrigin("*") //pour autoriser angular
public class CategorieRESTController {



    CategorieService categorieService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Categorie> getAllCategories(){

        return categorieService.findAllCategories();
    }



    @RequestMapping(method = RequestMethod.POST )
    public Categorie createCategorie(@RequestBody Categorie categorie) {
        return categorieService.saveCategorie(categorie);}

    @RequestMapping(method = RequestMethod.PUT)
    public Categorie updateCategorie(@RequestBody Categorie categorie){
        return categorieService.updateCategorie(categorie);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Categorie getCategorieById(@PathVariable("id") Long id){
        return categorieService.getCategorie(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCategorie(@PathVariable("id") Long id){
        categorieService.deleteCategorieById(id);
    }
}
