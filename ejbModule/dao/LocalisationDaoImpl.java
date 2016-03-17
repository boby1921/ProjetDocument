package dao;

import javax.ejb.Local;
import javax.ejb.Stateless;

import entity.Localisation;

@Stateless
@Local(LocalisationDao.class)
public class LocalisationDaoImpl extends GenericDaoImpl<Localisation, Integer> implements LocalisationDao{

	public LocalisationDaoImpl() {
		super(Localisation.class);
	}

}
