package fr.cinepantin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.cinepantin.model.Article;
import fr.cinepantin.service.ArticleService;

@Controller
@RequestMapping("/article/")
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/articlesListe")
	public String getArticles(Model model) throws Exception{
		List<Article> articles = articleService.getArticleList();
		model.addAttribute("articles", articles);
		
		return "articlesListe";
	}
	
	@RequestMapping("/detailArticle/{articleId}")
	public String detailArticle(@PathVariable Long articleId, Model model) throws Exception{
		Article article = articleService.getArticleById(articleId);
		model.addAttribute("article", article);
		
		return "detailArticle";
		
	}
	

}
