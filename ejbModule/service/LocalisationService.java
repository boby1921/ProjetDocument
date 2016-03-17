package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import dao.LocalisationDao;
import entity.Localisation;
import exception.DAOException;
import exception.ServiceException;

@Stateless
@Remote(ILocalisationService.class)
public class LocalisationService implements ILocalisationService{

//	@EJB(beanName ="LocalisationDao")
//	GenericDao<Localisation, Integer> localisationDao;
	
	@EJB
	LocalisationDao localisationDao;
	
	@Override
	public void createLocalisation(Localisation localisation) throws ServiceException {
		try {
			localisationDao.save(localisation);
		} catch (DAOException e) {
			throw new ServiceException();
		}
		
	}

	@Override
	public void deleteLocalisation(int cote) throws ServiceException {
		try {
			localisationDao.removeById(cote);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

	@Override
	public Localisation findById(int cote) throws ServiceException {
		try {
			return localisationDao.findByID(cote);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

	@Override
	public void updateLocalisation(Localisation localisation) throws ServiceException {
		try {
			localisationDao.update(localisation);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

	@Override
	public List<Localisation> getAllLocalisation() throws ServiceException {
		try {
			return localisationDao.findAll();
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

}
