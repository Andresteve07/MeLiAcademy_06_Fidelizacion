package com.mercadolibre.academy.fidelizacion.tests;

import com.mercadolibre.academy.fidelizacion.exception.NoDataFoundException;
import com.mercadolibre.academy.fidelizacion.modelo.service.ClienteService;
import com.mercadolibre.academy.fidelizacion.modelo.service.ClienteServiceImpl;
import com.mercadolibre.academy.fidelizacion.modelo.service.DireccionService;
import com.mercadolibre.academy.fidelizacion.modelo.service.DireccionServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DireccionService dir = new DireccionServiceImpl();
		ClienteService cli = new ClienteServiceImpl();
		
		try{
			cli.findAll();
		} catch(NoDataFoundException ndfExc){
			System.out.println(ndfExc.getMessage());
		}
	}

}
