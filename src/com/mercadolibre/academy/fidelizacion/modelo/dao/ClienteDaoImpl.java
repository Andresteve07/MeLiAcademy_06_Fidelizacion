package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Cliente;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDaoImpl;

public class ClienteDaoImpl extends GenericHibernateDaoImpl<Cliente, Integer> implements ClienteDao {

	private static final Logger logger = Logger.getLogger(ClienteDaoImpl.class);

	public ClienteDaoImpl() {
		super();
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> findAll() throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = sessionFactory.openSession();
		return session.createQuery("FROM Cliente").list();
	}

	public Cliente findById(Integer id) throws Exception {
		logger.info("Ejecutando metodo " + Thread.currentThread().getStackTrace()[1].getMethodName());
		Session session = sessionFactory.openSession();
		return (Cliente) session.get(Cliente.class, id);
	}
}
