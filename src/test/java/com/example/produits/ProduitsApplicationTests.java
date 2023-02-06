package com.example.produits;

import com.example.produits.entities.Categorie;
import com.example.produits.entities.Produit;
import com.example.produits.repos.CategorieRepository;
import com.example.produits.repos.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ProduitsApplicationTests {

    @Autowired
    private ProduitRepository produitRepository;

    @Autowired
    private CategorieRepository categorieRepository;

    @Test
    public void testCreateProduit() {
        Produit prod= new Produit("LENOVO",100000.0,new Date());
        produitRepository.save(prod);

    }

    @Test
    public void testCreateCategorie() {
        Categorie cat= new Categorie("Téléphones & Tablettes","Téléphones portables et tablettes");
        categorieRepository.save(cat);

    }

    @Test
    public void testFindProduit(){
        Produit p= produitRepository.findById(1L).get();
        System.out.println(p);
    }

    @Test
    public void testUpdateProduit(){
        Produit p= produitRepository.findById(3L).get();
        p.setNomProduit("Samsung");
        p.setPrixProduit(15000.0);
        produitRepository.save(p);
        System.out.println(p);
    }

    @Test
    public void testDeleteProduit(){
        produitRepository.deleteById(7L);
    }

    @Test
    public void testFindALLProduit(){
        List<Produit> prods= produitRepository.findAll();
        for (Produit p:prods){

            System.out.println(p);}
    }

    /*@Test
    public void testFindProduit(){
        List<Produit> prods= produitRepository.findByNomProduit("McBook PRO");
        for (Produit p:prods){

            System.out.println(p);}
    }

    @Test
    public void testFindProduit(){
        List<Produit> prods= produitRepository.findByNomProduitContains("M");
        for (Produit p:prods){

            System.out.println(p);}
    }*/

    @Test
    public void testfindByNomPrix(){
        List<Produit> prods= produitRepository.findByNomPrix("PC DELL", 1000.0);
        for (Produit p:prods){

            System.out.println(p);}
    }

    @Test
    public void testfindByCategorie(){
        Categorie cat= new Categorie();
        cat.setIdCat(1L);
        List<Produit> prods= produitRepository.findByCategorie(cat);
        for (Produit p:prods){

            System.out.println(p);}
    }

    @Test
    public void testfindByCategorieIdCat(){
        List<Produit> prods= produitRepository.findByCategorieIdCat(2L);
        for (Produit p:prods){

            System.out.println(p);}
    }

    @Test
    public void testfindByOrderByNomProduitAsc(){
        List<Produit> prods= produitRepository.findByOrderByNomProduitAsc();
        for (Produit p:prods){

            System.out.println(p);}
    }

    @Test
    public void trierProduitsNomsPrix(){
        List<Produit> prods= produitRepository.trierProduitsNomsPrix();
        for (Produit p:prods){

            System.out.println(p);}
    }
}
