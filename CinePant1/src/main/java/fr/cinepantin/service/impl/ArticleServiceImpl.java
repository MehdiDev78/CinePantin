package fr.cinepantin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.cinepantin.dao.ArticleDao;
import fr.cinepantin.model.Article;
import fr.cinepantin.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	private ArticleDao articleDao;

	@Override
	public List<Article> getArticleList() throws Exception {
		
		return ((ArticleDao) articleDao).getArticleList();
	}

	@Override
	public Article getArticleById(Long id) throws Exception {
		
		return articleDao.getArticleById(id);
	}

	@Override
	public void addArticle(Article article) throws Exception {
		articleDao.addArticle(article);
		
	}

	@Override
	public void editArticle(Article article) throws Exception {
		articleDao.editArticle(article);
		
	}

	@Override
	public void deleteArticle(Article article) throws Exception {
		articleDao.deleteArticle(article);
		
		
	}

}
