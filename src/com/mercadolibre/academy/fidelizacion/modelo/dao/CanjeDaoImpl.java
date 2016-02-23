package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Canje;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDaoImpl;

public class CanjeDaoImpl extends GenericHibernateDaoImpl<Canje, Integer> implements CanjeDao {

	private static final Logger logger = Logger.getLogger(CanjeDaoImpl.class);

	public CanjeDaoImpl() {
		super();
	}

	@SuppressWarnings("unchecked")
	public List<Canje> findAll() throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = sessionFactory.openSession();
		return session.createQuery("FROM Canje").list();
	}

	public Canje findById(Integer id) throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = super.getSessionFactory().openSession();
		return (Canje) session.get(Canje.class, id);
	}
}
