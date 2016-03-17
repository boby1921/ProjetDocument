package dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import entity.Auteur;
import entity.Document;

@Stateless
@Local(AuteurDao.class)
public class AutDaoImpl extends GenericDaoImpl<Auteur, Integer> implements AuteurDao{

	public AutDaoImpl() {
		super(Auteur.class);
	}

	@Override
	public Boolean alreadyExist(Auteur auteur) {
		TypedQuery<Auteur> query = em.createQuery("select a from Auteur a where a.nom = :nom", Auteur.class);
		query.setParameter("nom", auteur.getNom());
		
		return query.getResultList().size() > 0;
	}

	@Override
	public List<Document> getDocumentByAuteur(Auteur auteur) {
		TypedQuery<Document> query = em.createQuery("select d from Document d join d.auteur a where a.id = :id", Document.class);
		query.setParameter("id", auteur.getId());
		return query.getResultList();
	}

}
