package com.transfertargent.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.transfertargent.doa.EmetteurRepository;
import com.transfertargent.entities.Emetteur;


@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class EmetteurController {
	
	@Autowired
	private EmetteurRepository emetteurRepostory;
@PostMapping("/emetteur/add")
public Emetteur saveEmetteur(@RequestBody Emetteur em) {
    Emetteur e = new Emetteur();
    e.setNom(em.getNom());
    e.setPrenom(em.getPrenom());
    e.setTel(em.getTel());
    e.setCni(em.getCni());
    return emetteurRepostory.save(e);
}
@GetMapping(value = "/emetteur/liste")
public List<Emetteur> listEmetteurs() {
    return emetteurRepostory.findAll();
}
@GetMapping(value = "/emetteur/get/{id}")
public Emetteur getEmetteur(@PathVariable(name = "id") int id) {
    return emetteurRepostory.findById(id).get();
}

//pour mettre à jour
@PutMapping(value = "/emetteur/update/{id}")
public Emetteur update(@PathVariable(name = "id") int id, @RequestBody Emetteur e) {
    e.setId(id);
    return emetteurRepostory.save(e);
}

//pour supprimer
@DeleteMapping(value = "/emetteur/delete/{id}")
public void delete(@PathVariable(name = "id") int id) {
	emetteurRepostory.deleteById(id);
}
}
