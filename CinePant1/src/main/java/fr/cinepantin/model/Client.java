package fr.cinepantin.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long session;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@NotEmpty (message = "Veuillez renseigner le champs")
	@Column(name="nom_Client")
	private String nomClient;
	
	@Column(name="prenom_Client")
	@NotEmpty (message = "Veuillez renseigner le champs")
	private String prenomClient;
	
	@Column(name="date_Naissance")
	private Date dateNaissance;
	
	@NotEmpty (message = "Veuillez renseigner le champs")
	private String password;
	
	private boolean actif;

	@OneToOne
	@JoinColumn(name = "adresseClientId")
	private AdresseClient adresseClient;
	
	@OneToOne
	@JoinColumn(name = "adresseFacturationClientId")
	private AdresseFacturationClient adresseFacturationClient;
	
	@Column(name="tel_fixe")
	private String telFixe;
	@Column(name="tel_Mobile")
	private String telMobile;
	
	@Column(name="email")
	@NotEmpty (message = "Veuillez renseigner le champs")
	private String email;
	
	@OneToOne
	@JoinColumn(name="panierId")
	private Panier panier;

	
	private Date dateCreation;
	private Date dateModification;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Client(String nomClient, String prenomClient, Date dateNaissance, AdresseClient adresseClient,
			 String telFixe, String telMobile) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.dateNaissance = dateNaissance;
		this.adresseClient = adresseClient;
		this.telFixe = telFixe;
		this.telMobile = telMobile;
	}
	
	public Long getSession() {
		return session;
	}
	public void setSession(Long session) {
		this.session = session;
	}
	public Long getIdClient() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public AdresseClient getAdresseClient() {
		return adresseClient;
	}
	public void setAdresseClient(AdresseClient adresseClient) {
		this.adresseClient = adresseClient;
	}
	public String getTelFixe() {
		return telFixe;
	}
	public void setTelFixe(String telFixe) {
		this.telFixe = telFixe;
	}
	public String getTelMobile() {
		return telMobile;
	}
	public void setTelMobile(String telMobile) {
		this.telMobile = telMobile;
	}
	
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateModification() {
		return dateModification;
	}
	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AdresseFacturationClient getAdresseFacturationClient() {
		return adresseFacturationClient;
	}

	public void setAdresseFacturationClient(AdresseFacturationClient adresseFacturationClient) {
		this.adresseFacturationClient = adresseFacturationClient;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public Long getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
