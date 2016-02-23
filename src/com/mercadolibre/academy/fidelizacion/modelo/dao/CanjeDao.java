package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Canje;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDao;

public interface CanjeDao extends GenericHibernateDao<Canje, Integer> {

	public Canje findById(Integer id) throws Exception;
	public List<Canje> findAll() throws Exception;
}

