package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Compra;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDao;

public interface CompraDao extends GenericHibernateDao<Compra, Integer> {

	public Compra findById(Integer id) throws Exception;
	public List<Compra> findAll() throws Exception;
}

