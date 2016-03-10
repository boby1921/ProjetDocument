package service;

import java.util.List;

import entity.Document;
import entity.IDocument;

public interface IDocumentService {

	public void createDocument(Document document);
	public void deleteDocument(int cote);
	public IDocument findById(int cote);
	public void updateDocument(Document document);
	public List<IDocument> getAllDocument();
	
}
