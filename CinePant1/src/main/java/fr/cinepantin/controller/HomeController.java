package fr.cinepantin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String accueil(){
		return "accueil";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam (value = "error", required = false) String error, 
			@RequestParam(value = "logout", required = false) String logout, Model model ){
		
		if(error!=null){
			model.addAttribute("error", "Mot de passe ou username est invalide");
		}
		if(logout !=null){
			model.addAttribute("logout", "Vous êtes déconnecté !");
		}
			
		return logout;
		
	}
}
