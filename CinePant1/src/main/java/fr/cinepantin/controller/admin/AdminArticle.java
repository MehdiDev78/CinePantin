package fr.cinepantin.controller.admin;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import fr.cinepantin.model.Article;
import fr.cinepantin.service.ArticleService;

@Controller
@RequestMapping("/admin")
public class AdminArticle {
	
	private Path path;
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/article/ajouterArticle")
	public String addArticle(Model model){
		Article article = new Article();
		article.setCategorieArticle("livre");
		article.setStatut("active");
		article.setDesignation("Le tour du monde en 80 jours");
		
		model.addAttribute("article", article);
		
		return "ajouterArticle";
		
	}
	@RequestMapping(value = "/article/ajouterArticle", method = RequestMethod.POST)
	public String addArticlePost(@Valid @ModelAttribute("article") Article article, BindingResult result, 
			HttpServletRequest request) throws Exception{
		if(result.hasErrors()){
			return "ajouterArticle";
		}
		articleService.addArticle(article);
		
		MultipartFile articleImage = article.getImageArticle();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\" + article.getArticleId() + ".jpg");
		
		if(articleImage != null && !articleImage.isEmpty()){
			try{
				articleImage.transferTo(new File(path.toString()));
			}catch(Exception e){
				e.printStackTrace();
				throw new RuntimeException("Image non sauvegardée", e);
			}
		}
		return "redirect:/admin/inventaireArticle";
	}
	
	@RequestMapping("/article/modifierArticle/{id}")
	public String editArticle(@PathVariable("id") Long id,Model model) throws Exception{
		Article article = articleService.getArticleById(id);
		
		
		model.addAttribute("article", article);
		
		return "modifierArticle";
	}
	@RequestMapping(value = "/article/modifierArticle", method = RequestMethod.POST)
	public String editArticlePost(@Valid @ModelAttribute("article") Article article, BindingResult result, 
			HttpServletRequest request) throws Exception{
		if(result.hasErrors()){
			return "modifierArticle";
		}
		
		MultipartFile articleImage = article.getImageArticle();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\" + article.getArticleId() + ".jpg");
		
		if(articleImage != null && !articleImage.isEmpty()){
			try{
				articleImage.transferTo(new File(path.toString()));
			}catch(Exception e){
				e.printStackTrace();
				throw new RuntimeException("Image non sauvegardée", e);
			}
		}
		articleService.editArticle(article);
		
		return "redirect:/admin/inventaireArticle";
	}
	@RequestMapping("/article/deleteArticle/{id}")
	public String deleteArticle(@PathVariable Long id, Model model, HttpServletRequest request) throws Exception{
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\" + id + ".jpg");
		
		if(Files.exists(path)){
			try{
				Files.delete(path);
			}catch(Exception e){
				e.printStackTrace();
				
			}
			
		}
		Article article = articleService.getArticleById(id);
		articleService.deleteArticle(article);
		
		return "redirect:/admin/inventaireArticle";
		
	}

}
