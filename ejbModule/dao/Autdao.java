package dao;

import entity.Auteur;

public interface Autdao extends GenericDao<Auteur, Integer> {

	public Boolean alreadyExist(Auteur auteur);
	
}
