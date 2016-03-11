package fr.cinepantin.dao;

import java.util.List;

import fr.cinepantin.model.Article;

public interface ArticleDao {
	
List<Article> getArticleList() throws Exception;
	
	Article getArticleById (Long id)throws Exception;
	
	void addArticle(Article article)throws Exception;
	
	void editArticle(Article article)throws Exception;
	
	void deleteArticle(Article article)throws Exception;
}
