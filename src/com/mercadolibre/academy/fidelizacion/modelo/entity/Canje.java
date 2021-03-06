package com.mercadolibre.academy.fidelizacion.modelo.entity;

import java.util.Date;

/**
 * Canje generated by hbm2java
 */
public class Canje implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idCanje;
	private Cliente cliente;
	private Premio premio;
	private Date fecha;

	public Canje() {
	}

	public Canje(Cliente cliente, Premio premio, Date fecha) {
		this.cliente = cliente;
		this.premio = premio;
		this.fecha = fecha;
	}

	public Integer getIdCanje() {
		return this.idCanje;
	}

	public void setIdCanje(Integer idCanje) {
		this.idCanje = idCanje;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Premio getPremio() {
		return this.premio;
	}

	public void setPremio(Premio premio) {
		this.premio = premio;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
