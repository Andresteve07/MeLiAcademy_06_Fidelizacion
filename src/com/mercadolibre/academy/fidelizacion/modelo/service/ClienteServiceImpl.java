package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.ArrayList;
import java.util.List;

import com.mercadolibre.academy.fidelizacion.exception.InsertException;
import com.mercadolibre.academy.fidelizacion.exception.NoDataFoundException;
import com.mercadolibre.academy.fidelizacion.exception.SaveOrUpdateException;
import com.mercadolibre.academy.fidelizacion.modelo.dao.ClienteDao;
import com.mercadolibre.academy.fidelizacion.modelo.dao.ClienteDaoImpl;
import com.mercadolibre.academy.fidelizacion.modelo.entity.Cliente;
import com.mercadolibre.academy.fidelizacion.utils.Mensaje;

public class ClienteServiceImpl implements ClienteService {

	private ClienteDao dao;
	
	public ClienteServiceImpl() {
		dao = new ClienteDaoImpl();
	}
	
	public Cliente findById(Integer id) throws NoDataFoundException {
		Cliente instance = null;
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

	public List<Cliente> findAll() throws NoDataFoundException {
		List<Cliente> instances = null;
		try {
			instances = dao.findAll();
		} catch (Exception exception) {
			instances = new ArrayList<Cliente>();
			NoDataFoundException ndfExc = new NoDataFoundException(Mensaje.getResource().getString("msje.NoDataFoundExc") + "Cliente", exception);
			throw ndfExc;
		}
		return instances;
	}

	public Integer save(Cliente instance) throws InsertException {
		Integer id = null;
		try {
			id = dao.save(instance);
		} catch (Exception exception) {
			InsertException iExc = new InsertException(Mensaje.getResource().getString("msje.InsertExc")+ "Cliente", exception);
			throw iExc;
		}
		return id;
	}

	public void saveOrUpdate(Cliente instance) throws SaveOrUpdateException {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			SaveOrUpdateException souExc = new SaveOrUpdateException(Mensaje.getResource().getString("msje.SaveOrUpdateExc")+"Cliente", exception);
			throw souExc;
		}
	}

	public void update(Cliente instance) throws SaveOrUpdateException {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			SaveOrUpdateException souExc = new SaveOrUpdateException(Mensaje.getResource().getString("msje.SaveOrUpdateExc")+"Cliente", exception);
			throw souExc;
		}
	}

	public void delete(Cliente instance) throws SaveOrUpdateException {
		try {
			dao.saveOrUpdate(instance);
		} catch (Exception exception) {
			SaveOrUpdateException souExc = new SaveOrUpdateException(Mensaje.getResource().getString("msje.SaveOrUpdateExc")+"Cliente", exception);
			throw souExc;
		}
	}
}
