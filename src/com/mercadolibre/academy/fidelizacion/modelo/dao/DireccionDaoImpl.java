package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Direccion;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDaoImpl;

public class DireccionDaoImpl extends GenericHibernateDaoImpl<Direccion, Integer> implements DireccionDao {

	private static final Logger logger = Logger.getLogger(DireccionDaoImpl.class);

	public DireccionDaoImpl() {
		super();
	}

	@SuppressWarnings("unchecked")
	public List<Direccion> findAll() throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = sessionFactory.openSession();
		return session.createQuery("FROM Direccion").list();
	}

	public Direccion findById(Integer id) throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = super.getSessionFactory().openSession();
		return (Direccion) session.get(Direccion.class, id);
	}
}
