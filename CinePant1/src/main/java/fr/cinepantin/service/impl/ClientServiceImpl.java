package fr.cinepantin.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.cinepantin.model.Client;
import fr.cinepantin.service.ClientService;

@Service
//Annotation dénotant un Bean effectuant des traitements métier
public class ClientServiceImpl implements ClientService {

	@Override
	public void addClient(Client client) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client getClientById(Long clientId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> getTousLesClients() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClient(Client client) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editClient(Client client) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
