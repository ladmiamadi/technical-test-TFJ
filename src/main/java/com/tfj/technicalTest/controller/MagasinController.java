package com.tfj.technicalTest.controller;

import com.tfj.technicalTest.model.Magasin;
import com.tfj.technicalTest.repository.MagasinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MagasinController {

    @Autowired
    private MagasinRepository magasinRepository;

    @PostMapping("/add-magasin")
    public Magasin createMagasin(@RequestBody Magasin magasin) {
        return magasinRepository.save(magasin);
    }
}
