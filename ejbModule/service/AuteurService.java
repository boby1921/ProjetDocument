package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import dao.Autdao;
import entity.Auteur;
import exception.DAOException;
import exception.ServiceException;

@Stateless
@Remote(IAuteurService.class)
public class AuteurService implements IAuteurService{

//	@EJB(beanName ="AuteurDao")
//	GenericDao<Auteur, Integer> auteurDao;

	@EJB
	Autdao auteurDao;
	
	@Override
	public void createAuteur(Auteur auteur) throws ServiceException {
		try {
			System.out.println(auteurDao.alreadyExist(auteur));
			auteurDao.save(auteur);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

	@Override
	public void deleteAuteur(int cote) throws ServiceException {
		try {
			auteurDao.removeById(cote);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

	@Override
	public Auteur findById(int cote) throws ServiceException {
		try {
			return auteurDao.findByID(cote);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

	@Override
	public void updateAuteur(Auteur auteur) throws ServiceException {
		try {
			auteurDao.update(auteur);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

	@Override
	public List<Auteur> getAllAuteur() throws ServiceException {
		try {
			return auteurDao.findAll();
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

}
