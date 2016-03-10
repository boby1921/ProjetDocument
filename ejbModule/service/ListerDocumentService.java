package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import dao.IDocumentDao;
import entity.IDocument;

@Stateless
@LocalBean
public class ListerDocumentService {

	@EJB
	IDocumentDao documentDao;
	
	public List<IDocument> getAllDocument() {
		return documentDao.getAllDocument();
	}
	
}
