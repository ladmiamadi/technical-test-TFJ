package com.tfj.technicalTest.controller;

import com.tfj.technicalTest.exception.NotFoundMaterielException;
import com.tfj.technicalTest.model.Materiel;
import com.tfj.technicalTest.repository.MaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MaterielController {
    @Autowired
    private MaterielRepository materielRepository;

    @GetMapping("/get-materiel")
    public List<Materiel> getAllMaterials () {
        return materielRepository.findAll();
    }

    @GetMapping("/get-materiel/{id}")
    public Materiel getMaterialById(@PathVariable(value = "id") Integer id) {
        return materielRepository.findById(id).orElseThrow(() -> new NotFoundMaterielException("Id "+ id + " not found in database"));
    }

    @PostMapping("/add-materiel")
    public Materiel createMateriel(@RequestBody Materiel materiel) {
        return materielRepository.save(materiel);
    }

    @PutMapping("/update-materiel")
    public Materiel updateMateriel(@RequestBody Materiel materiel) {
        return materielRepository.save(materiel);
    }

    @DeleteMapping("/delete-materiel/{id}")
    public void deleteMateriel (@PathVariable(value = "id") Integer id) throws NotFoundMaterielException{
        Materiel materiel = materielRepository.findById(id).orElseThrow(() -> new NotFoundMaterielException("Id "+ id + " not found in database"));

        materielRepository.delete(materiel);
    }
}
