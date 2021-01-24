package com.transfertargent.entities;

public class Info {
	
	private Emetteur emetteur = new Emetteur();
	private Recepteur recepteur  = new Recepteur();
	private Envoie envoie = new Envoie();
	
	public Info() {
		super();
	}

	public Info(Emetteur emetteur, Recepteur recepteur, Envoie envoie) {
		super();
		this.emetteur = emetteur;
		this.recepteur = recepteur;
		this.envoie = envoie;
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

	public Envoie getEnvoie() {
		return envoie;
	}

	public void setEnvoie(Envoie envoie) {
		this.envoie = envoie;
	}
	
}
