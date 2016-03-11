package fr.cinepantin.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;


@Table(name="articles")
@Inheritance(strategy=InheritanceType.JOINED)
@Entity
public class Article implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long articleId;
	
	@NotEmpty(message="La désignation doit être renseigné")
	private String designation;
	
	@Min(value=0, message = "Le prix doit être supérieur à 0")
	private double prix;
	
	@NotEmpty(message="La description doit être renseigné")
	private String description;
	
	private String nomPhoto;
	@Min(value=0, message = "La quantité doit être supérieur à 0")
	private int quantiteStock;
	
	private String categorieArticle;
	private String statutArticle;
	
	@Transient //Pour indiquer qu'une variable membre n'est pas persistant
	private MultipartFile imageArticle;
	
	@OneToMany(mappedBy="article", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private List<LigneCommande> listeLigneCommandes;
	
	//Constructeur 1
	
	
	

	public Article(String designation, double prix, String description, String nomPhoto, int quantite) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.description = description;
		this.nomPhoto = nomPhoto;
		this.quantiteStock = quantite;
	}
	
	//Constructeur 2
	
	public Article() {
		// TODO Auto-generated constructor stub
	}
	
	//GETTERS AND SETTERS

	public Long getArticleId() {
		return articleId;
	}


	public void setArticleId(Long id) {
		this.articleId = id;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getNomPhoto() {
		return nomPhoto;
	}


	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}


	public int getQuantiteStock() {
		return quantiteStock;
	}


	public void setQuantiteStock(int quantite) {
		this.quantiteStock = quantite;
	}


	public String getCategorieArticle() {
		return categorieArticle;
	}


	public void setCategorieArticle(String categorieArticle) {
		this.categorieArticle = categorieArticle;
	}
	public String StatutArticle() {
		return statutArticle;
	}

	public void setStatut(String statut) {
		this.statutArticle = statutArticle;
	}
	
	public MultipartFile getImageArticle() {
		return imageArticle;
	}

	public void setImageArticle(MultipartFile imageArticle) {
		this.imageArticle = imageArticle;
	}
	
	public String getStatutArticle() {
		return statutArticle;
	}

	public void setStatutArticle(String statutArticle) {
		this.statutArticle = statutArticle;
	}

	public List<LigneCommande> getListeLigneCommandes() {
		return listeLigneCommandes;
	}

	public void setListeLigneCommandes(List<LigneCommande> listeLigneCommandes) {
		this.listeLigneCommandes = listeLigneCommandes;
	}
}
