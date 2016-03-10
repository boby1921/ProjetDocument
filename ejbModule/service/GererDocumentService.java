package service;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import dao.IDocumentDao;
import entity.Document;
import entity.IDocument;
import exception.DaoException;
import exception.ServiceExcetion;

@Stateless
@LocalBean
public class GererDocumentService {

	@EJB
	IDocumentDao documentDao;

	public void createDocument(Document document) throws ServiceExcetion {
		try {
			documentDao.createDocument(document);
		} catch (DaoException e) {
			throw new ServiceExcetion();
		}
	}

	public void deleteDocument(int cote) throws ServiceExcetion {
		try {
			documentDao.deleteDocument(cote);
		} catch (DaoException e) {
			throw new ServiceExcetion();
		}
	}

	public IDocument findById(int cote) throws ServiceExcetion {
		try {
			return documentDao.findById(cote);
		} catch (DaoException e) {
			throw new ServiceExcetion();
		}
	}

	public void updateDocument(Document document) throws ServiceExcetion {
		try {
			documentDao.updateDocument(document);
		} catch (DaoException e) {
			throw new ServiceExcetion();
		}
	}
	
}
