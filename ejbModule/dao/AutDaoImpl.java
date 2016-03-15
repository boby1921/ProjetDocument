package dao;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import entity.Auteur;

@Stateless
@Local(Autdao.class)
public class AutDaoImpl extends GenericDaoImpl<Auteur, Integer> implements Autdao{

	public AutDaoImpl() {
		super(Auteur.class);
	}

	@Override
	public Boolean alreadyExist(Auteur auteur) {
		TypedQuery<Auteur> query = em.createQuery("select a from Auteur a where a.nom = :nom", Auteur.class);
		query.setParameter("nom", auteur.getNom());
		
		return query.getResultList().size() > 0;
	}

}
