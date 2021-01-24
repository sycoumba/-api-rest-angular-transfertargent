package com.transfertargent.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.transfertargent.entities.Emetteur;

@RepositoryRestResource
public interface EmetteurRepository extends JpaRepository<Emetteur, Integer>{

}
