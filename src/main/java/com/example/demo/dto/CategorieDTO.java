package com.example.demo.dto;

public class CategorieDTO {
    public Long id;
    private String code;
    private String libelle;

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    public Long getId(){
        return id;
    }
}
