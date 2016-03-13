package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import dao.IDocumentDao;
import entity.Document;

@Stateless
@Remote(IDocumentService.class)
public class DocumentService implements IDocumentService{
	
	@EJB
	IDocumentDao documentDao;
	
	@Override
	public void createDocument(Document document) {
		documentDao.createDocument(document);;
	}

	@Override
	public void deleteDocument(int cote) {
		documentDao.deleteDocument(cote);
	}

	@Override
	public Document findById(int cote) {
		return documentDao.findById(cote);
	}

	@Override
	public void updateDocument(Document document) {
		documentDao.updateDocument(document);
	}

	@Override
	public List<Document> getAllDocument() {
		return documentDao.getAllDocument();
	}

}
