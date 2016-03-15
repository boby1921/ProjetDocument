package dao;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import entity.Auteur;

@Stateless
@Local(GenericDao.class)
public class AuteurDao extends GenericDaoImpl<Auteur, Integer>{

	public AuteurDao() {
		super(Auteur.class);
		
	}

	public Boolean alreadyExist(Auteur auteur) {
		TypedQuery<Auteur> query = em.createQuery("select a from Auteur a where a.nom = :nom", Auteur.class);
		query.setParameter("nom", auteur.getNom());
		
		return query.getResultList().size() > 0;
	}
}
