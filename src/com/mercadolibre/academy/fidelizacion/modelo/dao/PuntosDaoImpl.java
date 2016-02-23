package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Puntos;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDaoImpl;

public class PuntosDaoImpl extends GenericHibernateDaoImpl<Puntos, Integer> implements PuntosDao {

	private static final Logger logger = Logger.getLogger(PuntosDaoImpl.class);

	public PuntosDaoImpl() {
		super();
	}

	@SuppressWarnings("unchecked")
	public List<Puntos> findAll() throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = sessionFactory.openSession();
		return session.createQuery("FROM Puntos").list();
	}

	public Puntos findById(Integer id) throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = super.getSessionFactory().openSession();
		return (Puntos) session.get(Puntos.class, id);
	}
}
