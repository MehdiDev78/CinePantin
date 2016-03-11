package fr.cinepantin.service;

import java.util.List;

import fr.cinepantin.model.Client;

public interface ClientService {
	
	void addClient(Client client) throws Exception;
	Client getClientById(Long clientId) throws Exception;
	List<Client> getTousLesClients() throws Exception;
	void deleteClient(Client client) throws Exception;
	void editClient (Client client) throws Exception;
	

}
