package dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entity.IDocument;

@Stateless
@LocalBean
public class ListerDocumentDao {
	
	@PersistenceContext(unitName="pu")
	EntityManager em;

	public List<IDocument> getAllDocument() {
		TypedQuery<IDocument> query = em.createQuery("select d from Document d", IDocument.class);
		return query.getResultList();
	}

}
