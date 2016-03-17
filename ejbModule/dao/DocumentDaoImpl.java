package dao;

import javax.ejb.Local;
import javax.ejb.Stateless;

import entity.Document;

@Stateless
@Local(DocumentDao.class)
public class DocumentDaoImpl extends GenericDaoImpl<Document, Integer> implements DocumentDao{

	public DocumentDaoImpl() {
		super(Document.class);
	}

}
