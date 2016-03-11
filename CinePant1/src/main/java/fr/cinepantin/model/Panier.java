package fr.cinepantin.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Panier implements Serializable {
	
	
	@Id
    @GeneratedValue
	private Long panierId;
	
	@OneToMany(mappedBy="panier", cascade = CascadeType.ALL)
	private List<LigneCommande> ligneCommandes;
	
	@OneToOne
	@JoinColumn
	private Client client;
	
	private double totalPanier;

	public Long getPanierId() {
		return panierId;
	}

	public void setPanierId(Long panierId) {
		this.panierId = panierId;
	}

	public List<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}

	public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getTotalPanier() {
		return totalPanier;
	}

	public void setTotalPanier(double totalPanier) {
		this.totalPanier = totalPanier;
	}

	
	/*//ajouter les méthodes du panier
	
	public void ajouterLigneCommande(LigneCommande ligneCommande){
		Long articleId = ligneCommande.getArticle().getArticleId();
		
		//Je vérifie si une ligne de commande existe par son Id avec la methode HashMap constainKey
		//si elle existe je la mets à jour par exemple ajout d'une autre ligne
		//sinon je la creer
		
		if(ligneCommandes.containsKey(articleId)){
			LigneCommande existeLC = ligneCommandes.get(articleId);
			existeLC.setQuantite(existeLC.getQuantite()+ligneCommande.getQuantite());
			ligneCommandes.put(articleId, ligneCommande);
		}
		
		majTotalPanier();
		
	}
	public void supprimerLigneCommande(LigneCommande ligneCommande){
		Long articleId = ligneCommande.getArticle().getArticleId();
		ligneCommandes.remove(articleId);
		majTotalPanier();
		
	}
	
	public void majTotalPanier(){
		totalPanier = 0;
		for(LigneCommande ligneCommande : ligneCommandes.values()){
			totalPanier = totalPanier + ligneCommande.getPrixTotal();
			
		}
	}
*/
}
