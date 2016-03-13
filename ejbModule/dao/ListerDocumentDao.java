package dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entity.Document;

@Stateless
@LocalBean
public class ListerDocumentDao {
	
	@PersistenceContext(unitName="pu")
	EntityManager em;

	public List<Document> getAllDocument() {
		TypedQuery<Document> query = em.createQuery("select d from Document d", Document.class);
		return query.getResultList();
	}

}
