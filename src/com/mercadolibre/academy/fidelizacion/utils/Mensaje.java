package com.mercadolibre.academy.fidelizacion.utils;

import java.util.ResourceBundle;


public class Mensaje {
	private static ResourceBundle resource = null;
	
	public Mensaje(){
	}
	
	public static ResourceBundle getResource(){
		if(resource != null){
			return resource;
		} else {
			return ResourceBundle.getBundle(
					"com.mercadolibre.academy.fidelizacion.utils.mensaje-"+ 
					ResourceBundle.getBundle("fidelizacion-cfg").getString("idioma"));
		}
	}
}
