package com.tfj.technicalTest.controller;

import com.tfj.technicalTest.model.Categorie;
import com.tfj.technicalTest.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategorieController {

    @Autowired
    private CategorieRepository categorieRepository;

    @PostMapping("/add-category")
    public Categorie createCategory(@RequestBody Categorie categorie) {
        return categorieRepository.save(categorie);
    }
}
