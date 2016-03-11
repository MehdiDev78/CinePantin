package fr.cinepantin.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Commande implements Serializable {
	

	@Id
	@GeneratedValue
	private Long commandeId;
	
	@OneToOne
	@JoinColumn(name = "panierId")
	private Panier panier;
	
	@OneToOne
	@JoinColumn(name = "clientId")
	private Client client;
	
	
	@OneToOne
	@JoinColumn(name = "adresseClientId")
	private AdresseClient adresseClient;
	
	@OneToOne
	@JoinColumn(name = "adresseFacturationClientId")
	private AdresseFacturationClient adresseFacturationClient;

	public Long getCommandeId() {
		return commandeId;
	}

	public void setCommandeId(Long commandeId) {
		this.commandeId = commandeId;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public AdresseClient getAdresseClient() {
		return adresseClient;
	}

	public void setAdresseClient(AdresseClient adresseClient) {
		this.adresseClient = adresseClient;
	}

	public AdresseFacturationClient getAdresseFacturationClient() {
		return adresseFacturationClient;
	}

	public void setAdresseFacturationClient(AdresseFacturationClient adresseFacturationClient) {
		this.adresseFacturationClient = adresseFacturationClient;
	}
	
	

}
