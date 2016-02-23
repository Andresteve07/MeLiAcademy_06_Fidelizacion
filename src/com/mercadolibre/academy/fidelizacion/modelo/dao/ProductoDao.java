package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Producto;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDao;

public interface ProductoDao extends GenericHibernateDao<Producto, Integer> {

	public Producto findById(Integer id) throws Exception;
	public List<Producto> findAll() throws Exception;
}

