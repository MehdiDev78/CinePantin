package fr.cinepantin.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.cinepantin.model.Article;
import fr.cinepantin.service.ArticleService;

@Controller
@RequestMapping("/admin")
public class AdminHome {
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping
	public String adminPage(){
		return "admin";
	}
	
	@RequestMapping("/inventaireArticle")
	public String inventaireArticle(Model model) throws Exception{
		
		List<Article> articles = articleService.getArticleList();
		model.addAttribute("articles", articles);
		
		return "inventaireArticle";
	}
		
	@RequestMapping("/client")
	public String gestionClient(Model model){
		
		//ajouter le sevice client plus tard
		return "gestionClient";
	}
		
	
	
	

}
