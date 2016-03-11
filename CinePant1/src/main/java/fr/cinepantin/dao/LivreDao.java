package fr.cinepantin.dao;

import java.util.List;

import fr.cinepantin.model.Livre;

public interface LivreDao {
	void insert (Livre livre) throws Exception;
	void delete (Livre livre) throws Exception;
	void update (Livre livre) throws Exception;
	List<Livre> select(String critere) throws Exception;
	

}