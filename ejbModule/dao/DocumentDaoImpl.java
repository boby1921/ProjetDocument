package dao;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import entity.Document;
import entity.IDocument;

@Stateless
@Local(IDocumentDao.class)
public class DocumentDaoImpl implements IDocumentDao {

	@EJB
	GererDocumentDao gererDao;

	@EJB
	ListerDocumentDao listerDao;

	@Override
	public void createDocument(Document document) {
		gererDao.createDocument(document);
	}

	@Override
	public void deleteDocument(int cote) {
		gererDao.deleteDocument(cote);
	}

	@Override
	public IDocument findById(int cote) {
		return gererDao.findById(cote);
	}

	@Override
	public void updateDocument(Document document) {
		gererDao.updateDocument(document);
	}

	@Override
	public List<IDocument> getAllDocument() {
		return listerDao.getAllDocument();
	}

}
