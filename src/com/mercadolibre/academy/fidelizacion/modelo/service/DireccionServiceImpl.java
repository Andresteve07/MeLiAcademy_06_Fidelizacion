package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.ArrayList;
import java.util.List;

import com.mercadolibre.academy.fidelizacion.exception.DeleteException;
import com.mercadolibre.academy.fidelizacion.exception.InsertException;
import com.mercadolibre.academy.fidelizacion.exception.NoDataFoundException;
import com.mercadolibre.academy.fidelizacion.exception.SaveOrUpdateException;
import com.mercadolibre.academy.fidelizacion.modelo.dao.DireccionDao;
import com.mercadolibre.academy.fidelizacion.modelo.dao.DireccionDaoImpl;
import com.mercadolibre.academy.fidelizacion.modelo.entity.Direccion;
import com.mercadolibre.academy.fidelizacion.utils.Mensaje;

public class DireccionServiceImpl implements DireccionService {

	private DireccionDao dao;
	
	public DireccionServiceImpl() {
		dao = new DireccionDaoImpl();
	}

	public Direccion findById(Integer id) throws NoDataFoundException {
		Direccion instance = null;
		NoDataFoundException ndfExc = null;
		try {
			instance = dao.findById(id);
		} catch (Exception exception) {
			ndfExc = new NoDataFoundException(Mensaje.getResource().getString("msje.NoDataFoundExc") + "Cliente", exception);
			throw ndfExc;
		}
		if(instance == null){
			ndfExc = new NoDataFoundException(Mensaje.getResource().getString("error.instanciaNula") + "Cliente");
			throw ndfExc;
		}
		return instance;
	}

	public List<Direccion> findAll() throws NoDataFoundException {
		List<Direccion> instances = null;
		NoDataFoundException ndfExc = null;
		try {
			instances = dao.findAll();
		} catch (Exception exception) {
			instances = new ArrayList<Direccion>();
			ndfExc = new NoDataFoundException(Mensaje.getResource().getString("msje.NoDataFoundExc") + "Cliente", exception);
			throw ndfExc;
		}
		if(instances.size() == 0){
			ndfExc = new NoDataFoundException(Mensaje.getResource().getString("error.listaNula") + "Cliente");
			throw ndfExc;
		}
		return instances;
	}

	public Integer save(Direccion instance) throws InsertException {
		Integer id = null;
		try {
			id = dao.save(instance);
		} catch (Exception exception) {
			InsertException iExc = new InsertException(Mensaje.getResource().getString("msje.InsertExc")+ "Cliente", exception);
			throw iExc;
		}
		return id;
	}

	public void saveOrUpdate(Direccion instance) throws SaveOrUpdateException {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			SaveOrUpdateException souExc = new SaveOrUpdateException(Mensaje.getResource().getString("msje.SaveOrUpdateExc")+"Cliente", exception);
			throw souExc;
		}
	}

	public void update(Direccion instance) throws SaveOrUpdateException {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			SaveOrUpdateException souExc = new SaveOrUpdateException(Mensaje.getResource().getString("msje.SaveOrUpdateExc")+"Cliente", exception);
			throw souExc;
		}
	}

	public void delete(Direccion instance) throws DeleteException {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			DeleteException dExc = new DeleteException(Mensaje.getResource().getString("msje.DeleteExc")+"Cliente", exception);
			throw dExc;
		}
	}
}
