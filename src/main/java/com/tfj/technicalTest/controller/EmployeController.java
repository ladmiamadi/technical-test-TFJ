package com.tfj.technicalTest.controller;

import com.tfj.technicalTest.model.Employe;
import com.tfj.technicalTest.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeController {
    @Autowired
    private EmployeRepository employeRepository;

    @PostMapping("add-employer")
    public Employe createEmploye(@RequestBody Employe employe) {
        return employeRepository.save(employe);
    }
}
