package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Parametro;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDaoImpl;

public class ParametroDaoImpl extends GenericHibernateDaoImpl<Parametro, Integer> implements ParametroDao {

	private static final Logger logger = Logger.getLogger(ParametroDaoImpl.class);

	public ParametroDaoImpl() {
		super();
	}

	@SuppressWarnings("unchecked")
	public List<Parametro> findAll() throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = sessionFactory.openSession();
		return session.createQuery("FROM Parametro").list();
	}

	public Parametro findById(Integer id) throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = super.getSessionFactory().openSession();
		return (Parametro) session.get(Parametro.class, id);
	}
}
