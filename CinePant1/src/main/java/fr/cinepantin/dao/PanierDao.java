package fr.cinepantin.dao;

import java.util.List;

import fr.cinepantin.model.Panier;



public interface PanierDao {
	void create (Panier panier) throws Exception;
	void delete (Panier panier) throws Exception;
	void update (Panier panier, Long panierId) throws Exception;
	List<Panier> select(Long id) throws Exception;

}
