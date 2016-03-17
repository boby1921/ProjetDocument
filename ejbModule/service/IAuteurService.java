package service;

import java.util.List;

import entity.Auteur;
import entity.Document;
import exception.ServiceException;

public interface IAuteurService {

	public void createAuteur(Auteur auteur) throws ServiceException;
	public void deleteAuteur(int cote) throws ServiceException;
	public Auteur findById(int cote) throws ServiceException;
	public void updateAuteur(Auteur auteur) throws ServiceException;
	public List<Auteur> getAllAuteur() throws ServiceException;
	public List<Document> getDocumentByAuteur(Auteur auteur);
}
