package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Compra;

public interface CompraService {
	public Compra findById(Integer id);
	public List<Compra> findAll();
	public Integer save(Compra instance);  
	public void saveOrUpdate(Compra instance);
	public void update(Compra instance);
	public void delete(Compra instance);
}
