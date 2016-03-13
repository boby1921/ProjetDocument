package dao;

import java.util.List;

import entity.Document;

public interface IDocumentDao {

	public void createDocument(Document document);
	public void deleteDocument(int cote);
	public Document findById(int cote);
	public void updateDocument(Document document);
	public List<Document> getAllDocument();
	
}
