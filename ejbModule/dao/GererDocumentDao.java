package dao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Document;
import entity.IDocument;
import exception.DaoException;

@Stateless
@LocalBean
public class GererDocumentDao {

	@PersistenceContext(unitName="pu")
	EntityManager em;
	
	public void createDocument(Document document) throws DaoException {
		try {
			em.persist(document);			
		} catch (Exception e) {
			throw new DaoException();
		}
	}

	public void deleteDocument(int cote) throws DaoException {
		try {
			IDocument document = findById(cote);
			em.remove(document);			
		} catch (Exception e) {
			throw new DaoException();
		}
	}

	public IDocument findById(int cote) throws DaoException {
		try {
			return em.find(Document.class, cote);			
		} catch (Exception e) {
			throw new DaoException();
		}
	}

	public void updateDocument(Document document) throws DaoException {
		try {
			em.merge(document);			
		} catch (Exception e) {
			throw new DaoException();
		}
	}
}
