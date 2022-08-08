package com.tfj.technicalTest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "materiel")
public class Materiel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "materiel_id")
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;

    @Column(name = "marque")
    private String marque;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "taille")
    private String taille;

    @Column(name = "duree_location")
    private Integer duree_location;

    @Column(name = "cout_location")
    private BigDecimal cout_location;

    @Column(name = "cout_remplacement")
    private BigDecimal cout_remplacement;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="inventaire_id")
    private Inventaire inventaire;

    @OneToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="categorie_id")
    private Categorie categorie;

    @Column(name = "updated_at")
    private Timestamp updated_at;
}
