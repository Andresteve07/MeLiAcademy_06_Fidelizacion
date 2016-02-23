package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Direccion;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDao;

public interface DireccionDao extends GenericHibernateDao<Direccion, Integer> {

	public Direccion findById(Integer id) throws Exception;
	public List<Direccion> findAll() throws Exception;
}

