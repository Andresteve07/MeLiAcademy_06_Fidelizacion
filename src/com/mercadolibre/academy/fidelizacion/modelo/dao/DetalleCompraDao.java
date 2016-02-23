package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.DetalleCompra;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDao;

public interface DetalleCompraDao extends GenericHibernateDao<DetalleCompra, Integer> {

	public DetalleCompra findById(Integer id) throws Exception;
	public List<DetalleCompra> findAll() throws Exception;
}

