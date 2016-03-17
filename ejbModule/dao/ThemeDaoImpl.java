package dao;

import javax.ejb.Local;
import javax.ejb.Stateless;

import entity.Theme;

@Stateless
@Local(ThemeDao.class)
public class ThemeDaoImpl extends GenericDaoImpl<Theme, Integer> implements ThemeDao{

	public ThemeDaoImpl() {
		super(Theme.class);
	}
}
