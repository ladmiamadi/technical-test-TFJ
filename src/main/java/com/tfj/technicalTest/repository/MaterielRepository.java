package com.tfj.technicalTest.repository;

import com.tfj.technicalTest.model.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterielRepository extends JpaRepository<Materiel, Integer> {

    @Query(value = "SELECT nom AS Materiel, COUNT(nom) AS Quantite from materiel pd INNER JOIN inventaire cd ON cd.materiel_id = pd.materiel_id GROUP BY nom", nativeQuery = true)
    List<Materiel> findMaterialsQuantity();

}
