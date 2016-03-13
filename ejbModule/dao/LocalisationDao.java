package dao;

import javax.ejb.Local;
import javax.ejb.Stateless;

import entity.Localisation;

@Stateless
@Local(GenericDao.class)
public class LocalisationDao extends GenericDaoImpl<Localisation, Integer>{

	public LocalisationDao() {
		super(Localisation.class);
	}

}
