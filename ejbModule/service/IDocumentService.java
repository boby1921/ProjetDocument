package service;

import java.util.List;

import entity.Document;
import entity.IDocument;
import exception.ServiceExcetion;

public interface IDocumentService {

	public void createDocument(Document document) throws ServiceExcetion;
	public void deleteDocument(int cote)throws ServiceExcetion ;
	public IDocument findById(int cote) throws ServiceExcetion;
	public void updateDocument(Document document) throws ServiceExcetion;
	public List<IDocument> getAllDocument() throws ServiceExcetion;
	
}
