package dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entity.Document;

@Stateless
@Local(IDocumentDao.class)
public class DocumentDao implements IDocumentDao {

	@PersistenceContext(unitName = "pu")
	EntityManager em;

	public void createDocument(Document document) {
		em.persist(document);
	}

	public void deleteDocument(int cote) {
		Document document = findById(cote);
		em.remove(document);
	}

	public Document findById(int cote) {
		return em.find(Document.class, cote);
	}

	public void updateDocument(Document document) {
		em.merge(document);
	}

	public List<Document> getAllDocument() {
		TypedQuery<Document> query = em.createQuery("select d from Document d", Document.class);
		return query.getResultList();
	}

}
