package com.tfj.technicalTest.repository;

import com.tfj.technicalTest.model.Magasin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagasinRepository extends JpaRepository<Magasin, Integer> {
}
