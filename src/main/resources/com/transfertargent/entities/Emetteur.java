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
@Table(name="emetteur")
public class Emetteur {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	
private int id;
@Column
private String nom;
@Column
private String prenom;
@Column
private String tel;
@Column
private String cni;

@OneToMany(mappedBy = "emetteur" ,fetch = FetchType.LAZY)
private List<Envoie>envoies= new ArrayList<Envoie>();

	
}
