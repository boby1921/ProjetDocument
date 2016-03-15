package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import exception.DAOException;

public class GenericDaoImpl<T, K> implements GenericDao<T, K> {

	@PersistenceContext
	EntityManager em;

	private Class<T> entity;

	public GenericDaoImpl(Class<T> entity) {
		this.entity = entity;
	}

	@Override
	public T save(T t) throws DAOException {
		try {
			em.persist(t);
		} catch (Exception e) {
			throw new DAOException("Erreur persist dao");
		}
		return t;
	}

	@Override
	public T update(T t) throws DAOException {
		try {
			em.merge(t);
		} catch (Exception e) {
			throw new DAOException("Erreur update dao");
		}
		return t;
	}

	@Override
	public void remove(T t) throws DAOException {
		try {
			em.remove(t);
		} catch (Exception e) {
			throw new DAOException("erreur remove dao");
		}
	}

	@Override
	public void removeById(K id) throws DAOException {
		try {
			em.createQuery("delete from " + entity.getSimpleName() + " where id = " + id).executeUpdate();
		} catch (Exception e) {
			throw new DAOException("erreur removebyid dao");
		}

	}

	@Override
	public T findByID(K id) throws DAOException {
		try {
			return em.find(entity, id);
		} catch (PersistenceException e) {
			throw new DAOException("erreur findbyid dao");
		}
	}

	@Override
	public List<T> findAll() throws DAOException {
		try {

			TypedQuery<T> query = em.createQuery("select t from " + entity.getSimpleName() + " t", entity);
			return query.getResultList();
		} catch (PersistenceException e) {
			throw new DAOException("erreur findAll dao");
		}
	}

}
