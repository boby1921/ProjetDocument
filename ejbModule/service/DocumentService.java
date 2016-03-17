package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import dao.DocumentDao;
import entity.Document;
import exception.DAOException;
import exception.ServiceException;

@Stateless
@Remote(IDocumentService.class)
public class DocumentService implements IDocumentService{

//	@EJB(beanName ="DocumentDao")
//	GenericDao<Document, Integer> documentDao;
	
	@EJB
	DocumentDao documentDao;

	
	@Override
	public void createDocument(Document document) throws ServiceException {
		try {
			documentDao.save(document);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

	@Override
	public void deleteDocument(int cote) throws ServiceException {
		try {
			documentDao.removeById(cote);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

	@Override
	public Document findById(int cote) throws ServiceException {
		try {
			return documentDao.findByID(cote);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

	@Override
	public void updateDocument(Document document) throws ServiceException {
		try {
			documentDao.update(document);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

	@Override
	public List<Document> getAllDocument() throws ServiceException {
		try {
			return documentDao.findAll();
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

}
