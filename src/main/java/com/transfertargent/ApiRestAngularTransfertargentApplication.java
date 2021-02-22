package com.transfertargent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.transfertargent.doa.EmetteurRepository;
import com.transfertargent.doa.EnvoieRepository;
import com.transfertargent.doa.RecepteurRepository;
import com.transfertargent.entities.Emetteur;
import com.transfertargent.entities.Envoie;
import com.transfertargent.entities.Recepteur;

@SpringBootApplication
public class ApiRestAngularTransfertargentApplication implements CommandLineRunner {

	@Autowired
	private EmetteurRepository emetteurRepostory;
	
	@Autowired
	private RecepteurRepository recepteurRepository;
	
	@Autowired
	private EnvoieRepository envoieRepostory;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApiRestAngularTransfertargentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
			
			/*	Emetteur emetteur = new Emetteur();
				emetteur.setNom("SY");
				emetteur.setPrenom("Coumba");
				emetteur.setTel("775235100");
				emetteur.setCni("2757 1984 02501");
				emetteurRepostory.save(emetteur);
				
				Recepteur recepteur = new Recepteur();
				recepteur.setNom("NDIAYE");
				recepteur.setPrenom("Marieme");
				recepteur.setTel("772581104");
				recepteurRepository.save(recepteur);
				
				Envoie envoie = new Envoie();
				envoie.setMontant(45000);
				envoie.setDate("24-jan-2021");
				envoie.setEmetteur(emetteur);
				envoie.setRecepteur(recepteur);
				envoieRepostory.save(envoie);
				
				*/
				
	}

}
