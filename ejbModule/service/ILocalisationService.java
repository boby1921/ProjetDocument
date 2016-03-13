package service;

import java.util.List;

import entity.Localisation;
import exception.ServiceException;

public interface ILocalisationService {

	public void createLocalisation(Localisation localisation) throws ServiceException;
	public void deleteLocalisation(int cote) throws ServiceException;
	public Localisation findById(int cote) throws ServiceException;
	public void updateLocalisation(Localisation localisation) throws ServiceException;
	public List<Localisation> getAllLocalisation() throws ServiceException;
	
}
