package com.ejemplobd.demo.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "artista")
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_artista")
    private Integer idArtista;

    @Column(name = "artista", nullable = false, length = 100)
    private String nombreArtista;

    @Column(name = "pais_origen", length = 100)
    private String paisOrigen;


    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL)
    private List<AlbumMusical> albumes;
}
