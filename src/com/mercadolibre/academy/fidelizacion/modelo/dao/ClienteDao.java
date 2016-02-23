package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Cliente;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDao;

public interface ClienteDao extends GenericHibernateDao<Cliente, Integer> {

	public Cliente findById(Integer id) throws Exception;
	public List<Cliente> findAll() throws Exception;
}

