package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import dao.IDocumentDao;
import entity.Document;

@Stateless
@LocalBean
public class ListerDocumentService {

	@EJB
	IDocumentDao documentDao;
	
	public List<Document> getAllDocument() {
		return documentDao.getAllDocument();
	}
	
}
