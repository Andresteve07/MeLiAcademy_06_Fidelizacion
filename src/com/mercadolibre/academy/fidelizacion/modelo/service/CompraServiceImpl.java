package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.ArrayList;
import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.dao.CompraDao;
import com.mercadolibre.academy.fidelizacion.modelo.dao.CompraDaoImpl;
import com.mercadolibre.academy.fidelizacion.modelo.entity.Compra;

public class CompraServiceImpl implements CompraService {

	private CompraDao dao;
	
	public CompraServiceImpl() {
		dao = new CompraDaoImpl();
	}
	
	public Compra findById(Integer id) {
		Compra instance = null;
		try {
			instance = dao.findById(id);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return instance;
	}

	public List<Compra> findAll() {
		List<Compra> instances = null;
		try {
			instances = dao.findAll();
		} catch (Exception exception) {
			instances = new ArrayList<Compra>();
			exception.printStackTrace();
		}
		return instances;
	}

	public Integer save(Compra instance) {
		Integer id = null;
		try {
			id = dao.save(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return id;
	}

	public void saveOrUpdate(Compra instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void update(Compra instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void delete(Compra instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
