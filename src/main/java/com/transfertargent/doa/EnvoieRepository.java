package com.transfertargent.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.transfertargent.entities.Envoie;

@RepositoryRestResource
public interface EnvoieRepository extends JpaRepository<Envoie, Integer>{

}
