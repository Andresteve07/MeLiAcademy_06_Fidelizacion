package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Parametro;

public interface ParametroService {
	public Parametro findById(Integer id);
	public List<Parametro> findAll();
	public Integer save(Parametro instance);  
	public void saveOrUpdate(Parametro instance);
	public void update(Parametro instance);
	public void delete(Parametro instance);
}
