package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Producto;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDaoImpl;

public class ProductoDaoImpl extends GenericHibernateDaoImpl<Producto, Integer> implements ProductoDao {

	private static final Logger logger = Logger.getLogger(ProductoDaoImpl.class);

	public ProductoDaoImpl() {
		super();
	}

	@SuppressWarnings("unchecked")
	public List<Producto> findAll() throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = sessionFactory.openSession();
		return session.createQuery("FROM Producto").list();
	}

	public Producto findById(Integer id) throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = super.getSessionFactory().openSession();
		return (Producto) session.get(Producto.class, id);
	}
}
