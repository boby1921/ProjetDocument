package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import entity.Document;
import entity.IDocument;
import exception.ServiceExcetion;

@Stateless
@Remote(IDocumentService.class)
public class DocumentService implements IDocumentService{

	@EJB
	GererDocumentService gererService;
	
	@EJB
	ListerDocumentService listerService;
	
	@Override
	public void createDocument(Document document) throws ServiceExcetion {
		gererService.createDocument(document);;
	}

	@Override
	public void deleteDocument(int cote) throws ServiceExcetion {
		gererService.deleteDocument(cote);
	}

	@Override
	public IDocument findById(int cote) throws ServiceExcetion {
		return gererService.findById(cote);
	}

	@Override
	public void updateDocument(Document document) throws ServiceExcetion {
		gererService.updateDocument(document);
	}

	@Override
	public List<IDocument> getAllDocument() throws ServiceExcetion {
		return listerService.getAllDocument();
	}

}
