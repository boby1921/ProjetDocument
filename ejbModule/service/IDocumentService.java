package service;

import java.util.List;

import entity.Document;
import exception.ServiceException;

public interface IDocumentService {

	public void createDocument(Document document) throws ServiceException;
	public void deleteDocument(int cote) throws ServiceException;
	public Document findById(int cote) throws ServiceException;
	public void updateDocument(Document document) throws ServiceException;
	public List<Document> getAllDocument() throws ServiceException;
	
}
