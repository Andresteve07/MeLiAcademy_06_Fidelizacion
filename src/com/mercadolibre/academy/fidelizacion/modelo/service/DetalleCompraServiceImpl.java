package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.ArrayList;
import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.dao.DetalleCompraDao;
import com.mercadolibre.academy.fidelizacion.modelo.dao.DetalleCompraDaoImpl;
import com.mercadolibre.academy.fidelizacion.modelo.entity.DetalleCompra;

public class DetalleCompraServiceImpl implements DetalleCompraService {

	private DetalleCompraDao dao;
	
	public DetalleCompraServiceImpl() {
		dao = new DetalleCompraDaoImpl();
	}
	
	public DetalleCompra findById(Integer id) {
		DetalleCompra instance = null;
		try {
			instance = dao.findById(id);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return instance;
	}

	public List<DetalleCompra> findAll() {
		List<DetalleCompra> instances = null;
		try {
			instances = dao.findAll();
		} catch (Exception exception) {
			instances = new ArrayList<DetalleCompra>();
			exception.printStackTrace();
		}
		return instances;
	}

	public Integer save(DetalleCompra instance) {
		Integer id = null;
		try {
			id = dao.save(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return id;
	}

	public void saveOrUpdate(DetalleCompra instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void update(DetalleCompra instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void delete(DetalleCompra instance) {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
