package dao;

import javax.ejb.Local;
import javax.ejb.Stateless;

import entity.Document;

@Stateless
@Local(GenericDao.class)
public class DocumentDao extends GenericDaoImpl<Document, Integer>{

	public DocumentDao() {
		super(Document.class);
	}

}
