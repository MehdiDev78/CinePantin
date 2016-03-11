package fr.cinepantin.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommande implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long ligneCommandeId;
	
	@ManyToOne
	@JoinColumn(name = "articleId")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "panierId")
	private Panier panier;
	
	private int quantite;
	private double prixTotal;
	
	
	//constructeur sans parametres
	public LigneCommande() {
		
	}

	//constructeur avec parametres
	public LigneCommande(Article article) {
		super();
		this.article = article;
		this.quantite = 1;
		this.prixTotal = article.getPrix();
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}
	

}
