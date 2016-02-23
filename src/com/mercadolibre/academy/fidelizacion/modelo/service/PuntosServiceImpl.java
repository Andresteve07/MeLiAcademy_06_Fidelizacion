package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.ArrayList;
import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.dao.PuntosDao;
import com.mercadolibre.academy.fidelizacion.modelo.dao.PuntosDaoImpl;
import com.mercadolibre.academy.fidelizacion.modelo.entity.Puntos;

public class PuntosServiceImpl implements PuntosService {
	
	private PuntosDao dao;
	
	public PuntosServiceImpl() {
		dao = new PuntosDaoImpl();
	}

	public Puntos findById(Integer id) {
		Puntos instance = null;
		try {
			instance = dao.findById(id);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return instance;
	}

	public List<Puntos> findAll() {
		List<Puntos> instances = null;
		try {
			instances = dao.findAll();
		} catch (Exception exception) {
			instances = new ArrayList<Puntos>();
			exception.printStackTrace();
		}
		return instances;
	}

	public Integer save(Puntos instance) {
		Integer id = null;
		try {
			id = dao.save(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return id;
	}

	public void saveOrUpdate(Puntos instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void update(Puntos instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void delete(Puntos instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
