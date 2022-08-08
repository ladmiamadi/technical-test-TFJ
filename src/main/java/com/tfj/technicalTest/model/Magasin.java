package com.tfj.technicalTest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "magasin")
public class Magasin {
    @Id
    @Column(name = "magasin_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ville")
    private String ville;

    @Column(name = "updated_at")
    private Timestamp updated_at;

    @OneToMany(
            mappedBy = "magasin",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<Employe> comments = new ArrayList<>();
}
