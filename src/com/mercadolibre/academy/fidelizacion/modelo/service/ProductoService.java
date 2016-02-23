package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Producto;

public interface ProductoService {
	public Producto findById(Integer id);
	public List<Producto> findAll();
	public Integer save(Producto instance);  
	public void saveOrUpdate(Producto instance);
	public void update(Producto instance);
	public void delete(Producto instance);
}
