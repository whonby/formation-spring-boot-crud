package com.example.demo.conception;

import com.example.demo.entite.Categorie;

import java.util.List;

public interface ICategorie {
    public Categorie store(String code,String libelle);

    public List<Categorie> listes();

    public Categorie show(Long id);

    public Categorie update(Long id,String code,String libelle);

    public void delete(Long id);

    public Categorie store2(Categorie categorie);

    public Categorie update2(Categorie categorie);
}
