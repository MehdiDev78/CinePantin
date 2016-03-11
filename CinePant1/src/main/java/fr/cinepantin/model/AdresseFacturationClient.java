package fr.cinepantin.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AdresseFacturationClient implements Serializable {
	@Id
    @GeneratedValue
    private Long adresseClientId;
    private String nomRue;
    private String ville;
    private String pays;
    private String codePostal;
	
    
    public AdresseFacturationClient() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AdresseFacturationClient(Long adresseClientId, String nomRue, String ville, String pays, String codePostal) {
		super();
		this.adresseClientId = adresseClientId;
		this.nomRue = nomRue;
		this.ville = ville;
		this.pays = pays;
		this.codePostal = codePostal;
	}


	public Long getAdresseClientId() {
		return adresseClientId;
	}


	public void setAdresseClientId(Long adresseClientId) {
		this.adresseClientId = adresseClientId;
	}


	public String getNomRue() {
		return nomRue;
	}


	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	@Override
	public String toString() {
		return "AdresseFacturationClient [adresseClientId=" + adresseClientId +
				", nomRue=" + nomRue + ", ville="
				+ ville + ", pays=" + pays + ", codePostal=" + codePostal + "]";
	}
	
	

}
