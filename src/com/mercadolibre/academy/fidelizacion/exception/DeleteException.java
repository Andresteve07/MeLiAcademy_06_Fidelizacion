package com.mercadolibre.academy.fidelizacion.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

public class DeleteException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5753971713998162278L;
	private Throwable causa;
	
	public DeleteException(){
		
	}
	
	public DeleteException(String mensaje){
		super(mensaje);
	}
	
	public DeleteException(Throwable causa){
		super(causa.getMessage());
		this.causa=causa;
	}
	
	public DeleteException(String mensaje, Throwable causa){
		super(mensaje);
		this.causa = causa;
	}
	
	
	public String getFormattedException(){
		StringBuilder exception = new StringBuilder();
		exception.append("[DeleteException] ");
		if((this.getMessage() != null) && (!this.getMessage().equals(""))){
			exception.append(this.getMessage()+"\n");
		}
		if(this.causa != null){
			exception.append(this.causa.getCause()+"\n");
		}
		return exception.toString();
	}
	
	public void printStackTrace(PrintStream printStream){
		if(printStream == null){
			printStream = new PrintStream(System.err);
		}
		super.printStackTrace(printStream);
		if(causa != null){
			printStream.println("[DeleteException] Excepción original...");
			printStream.println(causa);
			printStream.println(causa.getMessage());
			causa.printStackTrace(printStream);
			printStream.println("Fin de la excepción original.");
		}
	}
	
	public void printStackTrace(PrintWriter printWriter){
		if(printWriter == null){
			printWriter = new PrintWriter(System.err);
		}
		super.printStackTrace(printWriter);
		if(causa != null){
			printWriter.println("[DeleteException] Excepción original...");
			printWriter.println(causa);
			printWriter.println(causa.getMessage());
			causa.printStackTrace(printWriter);
			printWriter.println("Fin de la excepción original.");
		}
	}
}
