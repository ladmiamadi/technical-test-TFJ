package com.tfj.technicalTest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inventaire")
public class Inventaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventaire_id")
    private Integer id;

    @OneToMany(
            mappedBy = "inventaire",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<Materiel> materiels= new ArrayList<>();

    @OneToOne(
            cascade = CascadeType.ALL
    )
    private Magasin magasin;
}
