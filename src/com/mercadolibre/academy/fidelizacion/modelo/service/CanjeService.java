package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Canje;
import com.mercadolibre.academy.fidelizacion.exception.*;

public interface CanjeService {
	public Canje findById(Integer id) throws NoDataFoundException;
	public List<Canje> findAll() throws NoDataFoundException ;
	public Integer save(Canje instance) throws InsertException ;  
	public void saveOrUpdate(Canje instance) throws SaveOrUpdateException ;
	public void update(Canje instance) throws SaveOrUpdateException ;
	public void delete(Canje instance) throws DeleteException ;
}
