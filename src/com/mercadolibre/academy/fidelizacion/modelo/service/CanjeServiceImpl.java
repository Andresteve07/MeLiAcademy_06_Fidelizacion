package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.ArrayList;
import java.util.List;


import com.mercadolibre.academy.fidelizacion.exception.DeleteException;
import com.mercadolibre.academy.fidelizacion.exception.InsertException;
import com.mercadolibre.academy.fidelizacion.exception.NoDataFoundException;
import com.mercadolibre.academy.fidelizacion.exception.SaveOrUpdateException;
import com.mercadolibre.academy.fidelizacion.modelo.dao.CanjeDao;
import com.mercadolibre.academy.fidelizacion.modelo.dao.CanjeDaoImpl;
import com.mercadolibre.academy.fidelizacion.modelo.entity.Canje;
import com.mercadolibre.academy.fidelizacion.utils.Mensaje;

public class CanjeServiceImpl implements CanjeService {
	
	private CanjeDao dao;
	
	public CanjeServiceImpl() {
		dao = new CanjeDaoImpl();
	}

	public Canje findById(Integer id) throws NoDataFoundException{
		Canje instance = null;
		try {
			instance = dao.findById(id);
		} catch (Exception exception) {
			//exception.printStackTrace();
			NoDataFoundException ndfExc = new NoDataFoundException(Mensaje.getResource().getString("msje.NoDataFoundExc")+"Canje", exception);
			throw ndfExc;
		}
		return instance;
	}

	public List<Canje> findAll() throws NoDataFoundException{
		List<Canje> instances = null;
		try {
			instances = dao.findAll();
		} catch (Exception exception) {
			instances = new ArrayList<Canje>();
			NoDataFoundException ndfExc = new NoDataFoundException(Mensaje.getResource().getString("msje.NoDataFoundExc")+"Canje", exception);
			throw ndfExc;
			//exception.printStackTrace();
		}
		return instances;
	}

	public Integer save(Canje instance) throws InsertException {
		Integer id = null;
		try {
			id = dao.save(instance);
		} catch (Exception exception) {
			InsertException iExc = new InsertException(Mensaje.getResource().getString("msje.InsertExc") + "Canje", exception);
			throw iExc;
			//exception.printStackTrace();
		}
		return id;
	}

	public void saveOrUpdate(Canje instance) throws SaveOrUpdateException {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			SaveOrUpdateException souExc = new SaveOrUpdateException(Mensaje.getResource().getString("msje.SaveOrUpdateExc") + "Canje", exception);
			throw souExc;
			//exception.printStackTrace();
		}
	}

	public void update(Canje instance) throws SaveOrUpdateException {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			SaveOrUpdateException souExc = new SaveOrUpdateException(Mensaje.getResource().getString("msje.SaveOrUpdateExc") + "Canje", exception);
			throw souExc;
			//exception.printStackTrace();
		}
	}

	public void delete(Canje instance) throws DeleteException {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			DeleteException dExc = new DeleteException(Mensaje.getResource().getString("msje.DeleteExc") +"Canje", exception);
			throw dExc;
			//exception.printStackTrace();
		}
	}
}
