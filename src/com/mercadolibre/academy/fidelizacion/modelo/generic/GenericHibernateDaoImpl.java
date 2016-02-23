package com.mercadolibre.academy.fidelizacion.modelo.generic;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class GenericHibernateDaoImpl<T extends Serializable, E> extends HibernateDaoSupport implements GenericHibernateDao<T, E> {

	private static final Logger logger = Logger.getLogger(GenericHibernateDaoImpl.class);
	protected static SessionFactory sessionFactory;
	
	public GenericHibernateDaoImpl() {
		if(sessionFactory == null) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
	}

	@SuppressWarnings("unchecked")
	public E save(T instance) throws Exception {
		Session session = sessionFactory.openSession();
		Transaction tx = (Transaction) session.beginTransaction();
		try {
			logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
			Object o = session.save(instance);
			tx.commit();
			return (E) o;
		} catch (Exception exception) {
			tx.rollback();
			logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), exception);
			throw exception;
		} finally {
			session.close();
		}
	}

	public void saveOrUpdate(T instance) throws Exception {
		Session session = sessionFactory.openSession();
		Transaction tx = (Transaction) session.beginTransaction();
		try {
			logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
			session.update(instance);
			tx.commit();
		} catch (Exception exception) {
			tx.rollback();
			logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), exception);
			throw exception;
		} finally {
			session.close();
		}
	}

	public void update(T instance) throws Exception {
		Session session = sessionFactory.openSession();
		Transaction tx = (Transaction) session.beginTransaction();
		try {
			logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
			session.update(instance);
			tx.commit();
		} catch (Exception exception) {
			tx.rollback();
			logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), exception);
			throw exception;
		} finally {
			session.close();
		}
	}

	public void delete(T instance) throws Exception {
		Session session = sessionFactory.openSession();
		Transaction tx = (Transaction) session.beginTransaction();
		try {
			logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
			session.delete(instance);
			tx.commit();
		} catch (Exception exception) {
			tx.rollback();
			logger.error(Thread.currentThread().getStackTrace()[1].getMethodName(), exception);
			throw exception;
		} finally {
			session.close();
		}
	}

	public abstract List<T> findAll() throws Exception;

	public abstract T findById(E id) throws Exception;

}
