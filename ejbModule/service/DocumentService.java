package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import entity.Document;

@Stateless
@Remote(IDocumentService.class)
public class DocumentService implements IDocumentService{

	@EJB
	GererDocumentService gererService;
	
	@EJB
	ListerDocumentService listerService;
	
	@Override
	public void createDocument(Document document) {
		gererService.createDocument(document);;
	}

	@Override
	public void deleteDocument(int cote) {
		gererService.deleteDocument(cote);
	}

	@Override
	public Document findById(int cote) {
		return gererService.findById(cote);
	}

	@Override
	public void updateDocument(Document document) {
		gererService.updateDocument(document);
	}

	@Override
	public List<Document> getAllDocument() {
		return listerService.getAllDocument();
	}

}
