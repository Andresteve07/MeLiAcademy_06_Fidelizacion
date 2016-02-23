package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.ArrayList;
import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.dao.DireccionDao;
import com.mercadolibre.academy.fidelizacion.modelo.dao.DireccionDaoImpl;
import com.mercadolibre.academy.fidelizacion.modelo.entity.Direccion;

public class DireccionServiceImpl implements DireccionService {

	private DireccionDao dao;
	
	public DireccionServiceImpl() {
		dao = new DireccionDaoImpl();
	}

	public Direccion findById(Integer id) {
		Direccion instance = null;
		try {
			instance = dao.findById(id);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return instance;
	}

	public List<Direccion> findAll() {
		List<Direccion> instances = null;
		try {
			instances = dao.findAll();
		} catch (Exception exception) {
			instances = new ArrayList<Direccion>();
			exception.printStackTrace();
		}
		return instances;
	}

	public Integer save(Direccion instance) {
		Integer id = null;
		try {
			id = dao.save(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return id;
	}

	public void saveOrUpdate(Direccion instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void update(Direccion instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void delete(Direccion instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
