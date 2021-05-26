package com.example.demo.services;

import com.example.demo.conception.ICategorie;
import com.example.demo.entite.Categorie;
import com.example.demo.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServiceCategorie implements ICategorie {

    @Autowired
    CategorieRepository categorieRepository;

    @Override
    public Categorie store(String code, String libelle) {
       Categorie categorie=categorieRepository.findByCode(code);
        if (categorie!=null) throw new RuntimeException("Le code existe");

        Categorie new_categorie=new Categorie();
        new_categorie.setCode(code);
        new_categorie.setLibelle(libelle);
        categorieRepository.save(new_categorie);
        return new_categorie;
    }

    @Override
    public List<Categorie> listes() {
        return categorieRepository.findAll();
    }

    @Override
    public Categorie show(Long id) {
        return categorieRepository.findById(id).get();
    }

    @Override
    public Categorie update(Long id, String code, String libelle) {
        Categorie categorie=show(id);
        categorie.setCode(code);
        categorie.setLibelle(libelle);
        categorieRepository.save(categorie);
        return categorie;
    }

    @Override
    public void delete(Long id) {
      categorieRepository.deleteById(id);
    }

    @Override
    public Categorie store2(Categorie categorie) {
        Categorie c=categorieRepository.findByCode(categorie.getCode());
        if (c!=null) throw new RuntimeException("Le code existe");
        categorieRepository.save(categorie);
        return categorieRepository.save(categorie);
    }

    @Override
    public Categorie update2(Categorie categorie) {
        Categorie c=categorieRepository.findByCode(categorie.getCode());
        if (c==null) throw new RuntimeException("Cette categorie n'existe pas");
        categorieRepository.save(categorie);
        return categorieRepository.save(categorie);
    }
}
