package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Compra;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDaoImpl;

public class CompraDaoImpl extends GenericHibernateDaoImpl<Compra, Integer> implements CompraDao {

	private static final Logger logger = Logger.getLogger(CompraDaoImpl.class);

	public CompraDaoImpl() {
		super();
	}

	@SuppressWarnings("unchecked")
	public List<Compra> findAll() throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = sessionFactory.openSession();
		return session.createQuery("FROM Compra").list();
	}

	public Compra findById(Integer id) throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = super.getSessionFactory().openSession();
		return (Compra) session.get(Compra.class, id);
	}
}
