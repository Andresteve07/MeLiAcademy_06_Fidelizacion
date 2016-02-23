package com.mercadolibre.academy.fidelizacion.modelo.entity;

public class Parametro implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idParametro;
	private String descripcion;
	private String valor;

	public Parametro() {
	}

	public Parametro(String descripcion, String valor) {
		this.descripcion = descripcion;
		this.valor = valor;
	}

	public Integer getIdParametro() {
		return this.idParametro;
	}

	public void setIdParametro(Integer idParametro) {
		this.idParametro = idParametro;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
