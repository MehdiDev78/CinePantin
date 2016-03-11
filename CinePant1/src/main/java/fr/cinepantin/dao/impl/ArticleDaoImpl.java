package fr.cinepantin.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.cinepantin.dao.ArticleDao;
import fr.cinepantin.model.Article;

@Repository//Donne un acces aux données
@Transactional//Sera utiliser en mode adamin pour ajouter, supprimer... les articles
public class ArticleDaoImpl implements ArticleDao {
	
	
	/*L'autowiring est un mécanisme où Spring lui-même détermine les liens entre beans, sans qu'on les ait explicités. 
	Le conteneur recherche les dépendances en suivant des règles.
	L'autowiring permet d'éviter de configurer les références. 
	Avec l'autowiring, plus besoin de ref="".
	Si l'autowiring est activé, Spring recherche automatiquement si un attribut ou un argument de constructeur correspondent à un bean géré. 
	Pour cela, Spring se base sur des correspondances.
	Ce mécanisme est configurable en xml, mais se fait le plus souvent au moyen d'annotations.
*/
	@PersistenceContext()
	private EntityManager em;
	
	@Override
	public List<Article> getArticleList() throws Exception {
		TypedQuery<Article> query = em.createQuery("from Article",Article.class);
		List<Article> articlesListe = query.getResultList();		
		return articlesListe;
	}
	

	@Override
	public Article getArticleById(Long id) throws Exception {
		Article article = em.find(Article.class, id);
		return article;
	}

	@Override
	public void addArticle(Article article) throws Exception {		
		em.persist(article);
	}

	@Override
	public void editArticle(Article article) throws Exception {
		em.merge(article);	
	}

	@Override
	public void deleteArticle(Article article) throws Exception {
		em.remove(article);
	}
	
	
}
