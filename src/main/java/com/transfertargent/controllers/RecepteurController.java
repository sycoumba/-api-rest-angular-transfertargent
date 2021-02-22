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
import com.transfertargent.doa.RecepteurRepository;
import com.transfertargent.entities.Emetteur;
import com.transfertargent.entities.Recepteur;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class RecepteurController {

	@Autowired
	private RecepteurRepository recepteurRepostory;
@PostMapping("/recepteur/add")
public Recepteur saveRecepteur(@RequestBody Recepteur re) {
    Recepteur r= new Recepteur();
    r.setNom(re.getNom());
    r.setPrenom(re.getPrenom());
    r.setTel(re.getTel());
    return recepteurRepostory.save(r);
	
}
@GetMapping(value = "/recepteur/liste")
public List<Recepteur> listRecepteurs() {
    return recepteurRepostory.findAll();
}
@GetMapping(value = "/recepteur/get/{id}")
public Recepteur getRecepteur(@PathVariable(name = "id") int id) {
    return recepteurRepostory.findById(id).get();
}

//pour mettre à jour
@PutMapping(value = "/recepteur/update/{id}")
public Recepteur update(@PathVariable(name = "id") int id, @RequestBody Recepteur e) {
    e.setId(id);
    return recepteurRepostory.save(e);
}

//pour supprimer
@DeleteMapping(value = "/recepteur/delete/{id}")
public void delete(@PathVariable(name = "id") int id) {
	recepteurRepostory.deleteById(id);
}
}
