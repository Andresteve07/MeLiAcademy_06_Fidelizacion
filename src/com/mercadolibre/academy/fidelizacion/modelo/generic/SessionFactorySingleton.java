package com.mercadolibre.academy.fidelizacion.modelo.generic;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactorySingleton {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static final Logger logger = Logger.getLogger(SessionFactorySingleton.class);
	
	private static SessionFactory buildSessionFactory(){
		try{
			return new Configuration().configure().buildSessionFactory();
		} catch(Throwable exc){
			logger.error("No pudo crearse el SessionFactory: "+ Thread.currentThread().getStackTrace()[1].getClassName());
			throw new ExceptionInInitializerError(exc);
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
