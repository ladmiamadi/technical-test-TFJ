package com.tfj.technicalTest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employe")
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employe_id")
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "email")
    private String email;

    @Column(name = "login")
    private String login;

    @Column(name = "mdp")
    private String password;

    @Column(name = "actif")
    private Boolean actif;

    @Column(name = "updated_at")
    private Timestamp updated_at;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="magasin_id")
    private Magasin magasin;
}
