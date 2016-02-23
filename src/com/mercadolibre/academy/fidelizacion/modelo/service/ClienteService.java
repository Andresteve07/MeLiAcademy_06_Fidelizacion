package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.exception.InsertException;
import com.mercadolibre.academy.fidelizacion.exception.NoDataFoundException;
import com.mercadolibre.academy.fidelizacion.exception.SaveOrUpdateException;
import com.mercadolibre.academy.fidelizacion.modelo.entity.Cliente;

public interface ClienteService {
	public Cliente findById(Integer id) throws NoDataFoundException;
	public List<Cliente> findAll() throws NoDataFoundException;
	public Integer save(Cliente instance) throws InsertException;  
	public void saveOrUpdate(Cliente instance) throws SaveOrUpdateException;
	public void update(Cliente instance) throws SaveOrUpdateException;
	public void delete(Cliente instance) throws SaveOrUpdateException;
}
