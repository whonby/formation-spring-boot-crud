package com.example.demo.conception;

import com.example.demo.entite.Categorie;
import com.example.demo.entite.Produit;

import java.math.BigDecimal;
import java.util.List;

public interface IProduit {
    public List<Produit> listes();

    public Produit store(String code, String name, String description, BigDecimal prix,Categorie categorie);

    public Produit update(Long id,String code, String name, String description, BigDecimal prix,Categorie categorie);

    public Produit show(Long id);

    public void delete(Long id);
}
