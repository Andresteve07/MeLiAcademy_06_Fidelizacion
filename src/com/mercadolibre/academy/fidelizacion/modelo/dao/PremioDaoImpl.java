package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Premio;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDaoImpl;

public class PremioDaoImpl extends GenericHibernateDaoImpl<Premio, Integer> implements PremioDao {

	private static final Logger logger = Logger.getLogger(PremioDaoImpl.class);

	public PremioDaoImpl() {
		super();
	}

	@SuppressWarnings("unchecked")
	public List<Premio> findAll() throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = sessionFactory.openSession();
		return session.createQuery("FROM Premio").list();
	}

	public Premio findById(Integer id) throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = super.getSessionFactory().openSession();
		return (Premio) session.get(Premio.class, id);
	}
}
