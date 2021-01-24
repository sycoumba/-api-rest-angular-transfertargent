package com.transfertargent.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "recepteur")
public class Recepteur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String tel;
	
	@OneToMany(mappedBy = "recepteur",fetch = FetchType.LAZY)
	private List<Envoie>envoies = new ArrayList<>();

	public Recepteur() {
		super();
	}

	public Recepteur(int id, String nom, String prenom, String tel, List<Envoie> envoies) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.envoies = envoies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public List<Envoie> getEnvoies() {
		return envoies;
	}

	public void setEnvoies(List<Envoie> envoies) {
		this.envoies = envoies;
	}
	
	
}
	