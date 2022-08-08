package com.tfj.technicalTest.repository;

import com.tfj.technicalTest.model.Inventaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventaireRepository extends JpaRepository<Inventaire, Integer> {
}
