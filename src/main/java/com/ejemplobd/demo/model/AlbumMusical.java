package com.ejemplobd.demo.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "album musical")
public class AlbumMusical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_album")
    private Integer idAlbum;

    @Column(name = "fecha_lanzamiento")
    @Temporal(TemporalType.DATE)
    private Date fecchaLanzamiento;

    @ManyToOne
    @JoinColumn(name = "id_artista", nullable = false)
    private Artista artista;
}
