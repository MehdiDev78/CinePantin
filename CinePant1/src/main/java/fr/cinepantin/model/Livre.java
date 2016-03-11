package fr.cinepantin.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Livre")
public class Livre extends Article implements Serializable {
	
	@Column(name="titre")
	private String titre;
	@Column(name="auteur")
	private String auteur;
	@Column(name="editeur")
	private String editeur;
	@Column(name="annee")
	private int annee;
	
	
	
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Livre(String designation, double prix, String description, String nomPhoto, int quantité,String titre,
			String auteur,String editeur,int annee) {
		//super(designation, prix, description, nomPhoto, quantité);
		// TODO Auto-generated constructor stub
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.annee = annee;

	}
	
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}

}
