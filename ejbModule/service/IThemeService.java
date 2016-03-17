package service;

import java.util.List;

import entity.Theme;
import exception.ServiceException;

public interface IThemeService {

	public void createTheme(Theme theme) throws ServiceException;
	public void deleteTheme(int cote) throws ServiceException;
	public Theme findById(int cote) throws ServiceException;
	public void updateTheme(Theme theme) throws ServiceException;
	public List<Theme> getAllTheme() throws ServiceException;
	
}
