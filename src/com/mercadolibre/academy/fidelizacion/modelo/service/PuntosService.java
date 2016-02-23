package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Puntos;

public interface PuntosService {
	public Puntos findById(Integer id);
	public List<Puntos> findAll();
	public Integer save(Puntos instance);  
	public void saveOrUpdate(Puntos instance);
	public void update(Puntos instance);
	public void delete(Puntos instance);
}
