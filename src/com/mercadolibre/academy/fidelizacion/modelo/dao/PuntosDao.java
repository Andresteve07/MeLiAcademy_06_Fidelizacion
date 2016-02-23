package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Puntos;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDao;

public interface PuntosDao extends GenericHibernateDao<Puntos, Integer> {

	public Puntos findById(Integer id) throws Exception;
	public List<Puntos> findAll() throws Exception;
}

