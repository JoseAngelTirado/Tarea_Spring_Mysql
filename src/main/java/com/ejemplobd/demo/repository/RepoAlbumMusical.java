package com.ejemplobd.demo.repository;

import com.ejemplobd.demo.model.AlbumMusical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepoAlbumMusical extends JpaRepository<AlbumMusical, Integer>{

}
