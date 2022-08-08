package com.tfj.technicalTest.controller;

import com.tfj.technicalTest.exception.NotFoundMaterielException;
import com.tfj.technicalTest.model.Inventaire;
import com.tfj.technicalTest.repository.InventaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventaireController {
    @Autowired
    private InventaireRepository inventaireRepository;

    @GetMapping("/get-inventaire")
    public List<Inventaire> getAllMaterials () {
        return inventaireRepository.findAll();
    }

    @GetMapping("get-inventaire/{id}")
    public Inventaire getInventaireById(@PathVariable(value = "id") Integer id) {
        return inventaireRepository.findById(id).orElseThrow(() -> new NotFoundMaterielException("Id "+ id + " not found in database"));
    }

    @PostMapping("add-inventaire")
    public Inventaire createMateriel(@RequestBody Inventaire inventaire) {
        return inventaireRepository.save(inventaire);
    }

    @PutMapping("update-inventaire")
    public Inventaire updateInventaire(@RequestBody Inventaire inventaire) {
        return inventaireRepository.save(inventaire);
    }

    @DeleteMapping("delete-inventaire/{id}")
    public void deleteInventaire (@PathVariable(value = "id") Integer id) throws NotFoundMaterielException{
        Inventaire inventaire = inventaireRepository.findById(id).orElseThrow(() -> new NotFoundMaterielException("Id "+ id + " not found in database"));

        inventaireRepository.delete(inventaire);
    }
}
