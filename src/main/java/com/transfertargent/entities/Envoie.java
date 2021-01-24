package com.transfertargent.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "envoie")
public class Envoie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String date;
	@Column
	private int montant;
	
	@ManyToOne
	@JoinColumn(name ="emeteur_id")
	private Emetteur emetteur =new Emetteur();
	
	@ManyToOne
	@JoinColumn(name ="recepteur_id")
	private Recepteur recepteur =new Recepteur();

	public Envoie() {
		super();
	}

	public Envoie(int id, String date, int montant, Emetteur emetteur, Recepteur recepteur) {
		super();
		this.id = id;
		this.date = date;
		this.montant = montant;
		this.emetteur = emetteur;
		this.recepteur = recepteur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public Emetteur getEmetteur() {
		return emetteur;
	}

	public void setEmetteur(Emetteur emetteur) {
		this.emetteur = emetteur;
	}

	public Recepteur getRecepteur() {
		return recepteur;
	}

	public void setRecepteur(Recepteur recepteur) {
		this.recepteur = recepteur;
	}
	
}
