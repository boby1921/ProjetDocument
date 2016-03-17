package dao;

import java.util.List;

import entity.Auteur;
import entity.Document;

public interface AuteurDao extends GenericDao<Auteur, Integer> {

	public Boolean alreadyExist(Auteur auteur);
	public List<Document> getDocumentByAuteur(Auteur auteur);
	
}
