package com.transfertargent.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.transfertargent.entities.Recepteur;

@RepositoryRestResource
public interface RecepteurRepository extends JpaRepository<Recepteur, Integer> {

}
