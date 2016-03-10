package dao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Document;
import entity.IDocument;

@Stateless
@LocalBean
public class GererDocumentDao {

	@PersistenceContext(unitName="pu")
	EntityManager em;
	
	public void createDocument(Document document) {
		em.persist(document);
	}

	public void deleteDocument(int cote) {
		IDocument document = findById(cote);
		em.remove(document);
	}

	public IDocument findById(int cote) {
		return em.find(Document.class, cote);
	}

	public void updateDocument(Document document) {
		em.merge(document);
	}
}
