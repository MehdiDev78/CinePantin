package fr.cinepantin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.cinepantin.model.AdresseClient;
import fr.cinepantin.model.AdresseFacturationClient;
import fr.cinepantin.model.Client;
import fr.cinepantin.service.ClientService;

@Controller
public class RegisterController {
	
	private ClientService clientService;
	
	@RequestMapping("/register")
	public String registerClient(Model model){
		
		Client client = new Client();
		AdresseClient adresseClient = new AdresseClient();
		AdresseFacturationClient adresseFacturationClient = new AdresseFacturationClient();
		client.setAdresseClient(adresseClient);
		client.setAdresseFacturationClient(adresseFacturationClient);
		
		model.addAttribute("client", client);
		
		
		return "registerClient";
		
	}
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public String registerClientPost(@ModelAttribute("client")Client client, Model model) throws Exception{
		client.setActif(true);
		clientService.addClient(client);
		
		return "registerClientSuccess";
		
	}
	
}
