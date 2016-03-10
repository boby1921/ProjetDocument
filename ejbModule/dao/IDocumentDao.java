package dao;

import java.util.List;

import entity.Document;
import entity.IDocument;
import exception.DaoException;

public interface IDocumentDao {

	public void createDocument(Document document) throws DaoException;
	public void deleteDocument(int cote) throws DaoException;
	public IDocument findById(int cote) throws DaoException;
	public void updateDocument(Document document) throws DaoException;
	public List<IDocument> getAllDocument() throws DaoException;
	
}
