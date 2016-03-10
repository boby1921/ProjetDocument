package dao;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import entity.Document;
import entity.IDocument;
import exception.DaoException;

@Stateless
@Local(IDocumentDao.class)
public class DocumentDaoImpl implements IDocumentDao {

	@EJB
	GererDocumentDao gererDao;

	@EJB
	ListerDocumentDao listerDao;

	@Override
	public void createDocument(Document document) throws DaoException {
		gererDao.createDocument(document);
	}

	@Override
	public void deleteDocument(int cote) throws DaoException {
		gererDao.deleteDocument(cote);
	}

	@Override
	public IDocument findById(int cote) throws DaoException {
		return gererDao.findById(cote);
	}

	@Override
	public void updateDocument(Document document) throws DaoException {
		gererDao.updateDocument(document);
	}

	@Override
	public List<IDocument> getAllDocument() throws DaoException {
		return listerDao.getAllDocument();
	}

}
