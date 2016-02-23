package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Premio;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDao;

public interface PremioDao extends GenericHibernateDao<Premio, Integer> {

	public Premio findById(Integer id) throws Exception;
	public List<Premio> findAll() throws Exception;
}

