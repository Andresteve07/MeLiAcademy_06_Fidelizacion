package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.mercadolibre.academy.fidelizacion.modelo.entity.DetalleCompra;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDaoImpl;

public class DetalleCompraDaoImpl extends GenericHibernateDaoImpl<DetalleCompra, Integer> implements DetalleCompraDao {

	private static final Logger logger = Logger.getLogger(DetalleCompraDaoImpl.class);

	public DetalleCompraDaoImpl() {
		super();
	}

	@SuppressWarnings("unchecked")
	public List<DetalleCompra> findAll() throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = sessionFactory.openSession();
		return session.createQuery("FROM DetalleCompra").list();
	}

	public DetalleCompra findById(Integer id) throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = super.getSessionFactory().openSession();
		return (DetalleCompra) session.get(DetalleCompra.class, id);
	}
}
