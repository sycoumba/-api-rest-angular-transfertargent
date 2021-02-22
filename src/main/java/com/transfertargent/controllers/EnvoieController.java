package com.transfertargent.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.transfertargent.doa.EnvoieRepository;
import com.transfertargent.entities.Envoie;


@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class EnvoieController {

	@Autowired
	private EnvoieRepository envoieRepository;
	
	
	 @GetMapping(value = "/liste")
	    public List<Envoie> listeEnvoies() {
	        return envoieRepository.findAll();
	    }

	   @GetMapping(value = "/get/{id}")
	    public Envoie getEnvoie(@PathVariable(name = "id") int id) {
	        return envoieRepository.getOne(id);
	    }

	 

	  //  pour supprimer
	    @DeleteMapping(value = "/delete/{id}")
	    public void delete(@PathVariable(name = "id") int id) {
	   	envoieRepository.deleteById(id);
	    }
}
	

