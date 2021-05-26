package com.example.demo.web;

import com.example.demo.dto.CategorieDTO;
import com.example.demo.entite.Categorie;
import com.example.demo.services.ServiceCategorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class CategorieController {

    @Autowired
    ServiceCategorie serviceCategorie;


    @GetMapping("/categorie")
    public List<Categorie> liste(){
        return serviceCategorie.listes();
    }

    @PostMapping("/categorie")
    public Categorie store(@RequestBody CategorieDTO categorieDTO){
        return serviceCategorie.store(categorieDTO.getCode(),categorieDTO.getLibelle());
    }

    @PutMapping("/categorie")
    public Categorie update(@RequestBody CategorieDTO categorieDTO){
        return serviceCategorie.update(categorieDTO.id,categorieDTO.getCode(),categorieDTO.getLibelle());
    }

    @GetMapping("/categorie/{id}")
    public Categorie show(@PathVariable Long id){
        return serviceCategorie.show(id);
    }

    @DeleteMapping("/categorie/{id}")
    public void delete(@PathVariable Long id){
        serviceCategorie.delete(id);
    }


    @PostMapping("/categorie2")
    public Categorie store2(@RequestBody Categorie categorie){
        return serviceCategorie.store2(categorie);
    }

    @PutMapping("/categorie2")
    public Categorie update2(@RequestBody Categorie categorie){
        return serviceCategorie.update2(categorie);
    }
}
