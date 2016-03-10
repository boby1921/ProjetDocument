package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import dao.IDocumentDao;
import entity.IDocument;
import exception.DaoException;
import exception.ServiceExcetion;

@Stateless
@LocalBean
public class ListerDocumentService {

	@EJB
	IDocumentDao documentDao;
	
	public List<IDocument> getAllDocument() throws ServiceExcetion{
		try {
			return documentDao.getAllDocument();
		} catch (DaoException e) {
			throw new ServiceExcetion();
		}
	}
	
}
