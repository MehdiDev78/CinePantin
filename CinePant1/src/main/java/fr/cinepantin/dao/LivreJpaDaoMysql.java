package fr.cinepantin.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.cinepantin.model.Livre;
import fr.cinepantin.dao.Dao;
import fr.cinepantin.dao.LivreDao;

@Dao
public class LivreJpaDaoMysql implements LivreDao {
	
	@PersistenceContext(unitName="CinePant1")
	private EntityManager em;
	@Resource
	private UserTransaction ut;

	@Override
	public void insert(Livre livre) throws Exception {
		System.out.println("insert");
		ut.begin();
		em.persist(livre);
		ut.commit();
	}
	@Override
	public List<Livre> select(String critere) throws Exception {
		return null;
//		String query = "select livre from Livre livre where livre.auteur like ?1";
//		TypedQuery<Livre> q = em.createQuery(query,Livre.class); 
//		q.setParameter(1, "%"+critere+"%");
//		return q.getResultList();
	}

	@Override
	public void delete(Livre livre) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Livre livre) throws Exception {
		// TODO Auto-generated method stub
		
	}
}