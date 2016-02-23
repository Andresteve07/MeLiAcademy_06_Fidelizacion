package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Premio;

public interface PremioService {
	public Premio findById(Integer id);
	public List<Premio> findAll();
	public Integer save(Premio instance);  
	public void saveOrUpdate(Premio instance);
	public void update(Premio instance);
	public void delete(Premio instance);
}
