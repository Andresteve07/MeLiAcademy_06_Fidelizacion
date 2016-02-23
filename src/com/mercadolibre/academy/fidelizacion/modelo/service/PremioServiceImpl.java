package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.ArrayList;
import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.dao.PremioDao;
import com.mercadolibre.academy.fidelizacion.modelo.dao.PremioDaoImpl;
import com.mercadolibre.academy.fidelizacion.modelo.entity.Premio;

public class PremioServiceImpl implements PremioService {

	private PremioDao dao;
	
	public PremioServiceImpl() {
		dao = new PremioDaoImpl();
	}

	public Premio findById(Integer id) {
		Premio instance = null;
		try {
			instance = dao.findById(id);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return instance;
	}

	public List<Premio> findAll() {
		List<Premio> instances = null;
		try {
			instances = dao.findAll();
		} catch (Exception exception) {
			instances = new ArrayList<Premio>();
			exception.printStackTrace();
		}
		return instances;
	}

	public Integer save(Premio instance) {
		Integer id = null;
		try {
			id = dao.save(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return id;
	}

	public void saveOrUpdate(Premio instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void update(Premio instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void delete(Premio instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
