package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.ArrayList;
import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.dao.ProductoDao;
import com.mercadolibre.academy.fidelizacion.modelo.dao.ProductoDaoImpl;
import com.mercadolibre.academy.fidelizacion.modelo.entity.Producto;

public class ProductoServiceImpl implements ProductoService {

	private ProductoDao dao;
	
	public ProductoServiceImpl() {
		dao = new ProductoDaoImpl();
	}

	public Producto findById(Integer id) {
		Producto instance = null;
		try {
			instance = dao.findById(id);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return instance;
	}

	public List<Producto> findAll() {
		List<Producto> instances = null;
		try {
			instances = dao.findAll();
		} catch (Exception exception) {
			instances = new ArrayList<Producto>();
			exception.printStackTrace();
		}
		return instances;
	}

	public Integer save(Producto instance) {
		Integer id = null;
		try {
			id = dao.save(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return id;
	}

	public void saveOrUpdate(Producto instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void update(Producto instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void delete(Producto instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
