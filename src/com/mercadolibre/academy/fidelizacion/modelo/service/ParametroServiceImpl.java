package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.ArrayList;
import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.dao.ParametroDao;
import com.mercadolibre.academy.fidelizacion.modelo.dao.ParametroDaoImpl;
import com.mercadolibre.academy.fidelizacion.modelo.entity.Parametro;

public class ParametroServiceImpl implements ParametroService {

	private ParametroDao dao;
	
	public ParametroServiceImpl() {
		dao = new ParametroDaoImpl();
	}

	public Parametro findById(Integer id) {
		Parametro instance = null;
		try {
			instance = dao.findById(id);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return instance;
	}

	public List<Parametro> findAll() {
		List<Parametro> instances = null;
		try {
			instances = dao.findAll();
		} catch (Exception exception) {
			instances = new ArrayList<Parametro>();
			exception.printStackTrace();
		}
		return instances;
	}

	public Integer save(Parametro instance) {
		Integer id = null;
		try {
			id = dao.save(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return id;
	}

	public void saveOrUpdate(Parametro instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void update(Parametro instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void delete(Parametro instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
