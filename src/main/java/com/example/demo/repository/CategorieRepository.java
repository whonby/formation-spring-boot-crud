package com.example.demo.repository;

import com.example.demo.entite.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {

    public Categorie findByCode(String code);
}
