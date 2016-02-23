package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.exception.DeleteException;
import com.mercadolibre.academy.fidelizacion.exception.InsertException;
import com.mercadolibre.academy.fidelizacion.exception.NoDataFoundException;
import com.mercadolibre.academy.fidelizacion.exception.SaveOrUpdateException;
import com.mercadolibre.academy.fidelizacion.modelo.entity.Direccion;

public interface DireccionService {
	public Direccion findById(Integer id) throws NoDataFoundException;
	public List<Direccion> findAll() throws NoDataFoundException;
	public Integer save(Direccion instance) throws InsertException;  
	public void saveOrUpdate(Direccion instance) throws SaveOrUpdateException;
	public void update(Direccion instance) throws SaveOrUpdateException;
	public void delete(Direccion instance) throws DeleteException;
}
