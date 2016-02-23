package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.DetalleCompra;

public interface DetalleCompraService {
	public DetalleCompra findById(Integer id);
	public List<DetalleCompra> findAll();
	public Integer save(DetalleCompra instance);  
	public void saveOrUpdate(DetalleCompra instance);
	public void update(DetalleCompra instance);
	public void delete(DetalleCompra instance);
}
