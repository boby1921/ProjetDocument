package service;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import dao.IDocumentDao;
import entity.Document;

@Stateless
@LocalBean
public class GererDocumentService {

	@EJB
	IDocumentDao documentDao;

	public void createDocument(Document document) {
		documentDao.createDocument(document);
	}

	public void deleteDocument(int cote) {
		documentDao.deleteDocument(cote);
	}

	public Document findById(int cote) {
		return documentDao.findById(cote);
	}

	public void updateDocument(Document document) {
		documentDao.updateDocument(document);
	}
	
}
