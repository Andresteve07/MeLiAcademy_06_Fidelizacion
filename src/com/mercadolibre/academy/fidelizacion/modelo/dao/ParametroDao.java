package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Parametro;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDao;

public interface ParametroDao extends GenericHibernateDao<Parametro, Integer> {

	public Parametro findById(Integer id) throws Exception;
	public List<Parametro> findAll() throws Exception;
}

