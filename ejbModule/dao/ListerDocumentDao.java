package dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entity.IDocument;
import exception.DaoException;

@Stateless
@LocalBean
public class ListerDocumentDao {
	
	@PersistenceContext(unitName="pu")
	EntityManager em;

	public List<IDocument> getAllDocument() throws DaoException {
		try {
			TypedQuery<IDocument> query = em.createQuery("select d from Document d", IDocument.class);
			return query.getResultList();
		} catch (Exception e) {
			throw new DaoException();
		}
	}

}
