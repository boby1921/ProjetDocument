package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import dao.ThemeDao;
import entity.Theme;
import exception.ServiceException;

@Stateless
@Remote(IThemeService.class)
public class ThemeService implements IThemeService {

	@EJB
	ThemeDao themeDao;
	
	@Override
	public void createTheme(Theme theme) throws ServiceException {
		
		try {
			themeDao.save(theme);
		} catch (Exception e) {
			throw new ServiceException();
		}
		
	}

	@Override
	public void deleteTheme(int cote) throws ServiceException {
		try {
			themeDao.removeById(cote);
		} catch (Exception e) {
			throw new ServiceException();
		}
	}

	@Override
	public Theme findById(int cote) throws ServiceException {
		try {
			return themeDao.findByID(cote);
		} catch (Exception e) {
			throw new ServiceException();
		}
	}

	@Override
	public void updateTheme(Theme theme) throws ServiceException {
		try {
			themeDao.update(theme);
		} catch (Exception e) {
			throw new ServiceException();
		}

	}

	@Override
	public List<Theme> getAllTheme() throws ServiceException {
		try {
			return themeDao.findAll();
		} catch (Exception e) {
			throw new ServiceException();
		}
	}

}
