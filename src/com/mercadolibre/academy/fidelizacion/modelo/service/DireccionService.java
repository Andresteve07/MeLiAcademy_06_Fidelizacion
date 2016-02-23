package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Direccion;

public interface DireccionService {
	public Direccion findById(Integer id);
	public List<Direccion> findAll();
	public Integer save(Direccion instance);  
	public void saveOrUpdate(Direccion instance);
	public void update(Direccion instance);
	public void delete(Direccion instance);
}
