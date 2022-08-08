package com.tfj.technicalTest.repository;

import com.tfj.technicalTest.model.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterielRepository extends JpaRepository<Materiel, Integer> {

    @Query("SELECT count nom As Materiel From materiel ")
    List<Materiel> findMaterialsQuantity();

}
