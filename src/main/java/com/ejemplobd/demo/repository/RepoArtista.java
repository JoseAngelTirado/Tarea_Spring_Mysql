package com.ejemplobd.demo.repository;

import com.ejemplobd.demo.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoArtista extends JpaRepository<Artista, Integer> {
}
