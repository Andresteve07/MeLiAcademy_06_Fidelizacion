package com.mercadolibre.academy.fidelizacion.modelo.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Compra generated by hbm2java
 */
public class Compra implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idCompra;
	private Cliente cliente;
	private Date fecha;
	private int puntos;
	private Set<DetalleCompra> detalleCompras = new HashSet<DetalleCompra>(0);

	public Compra() {
	}

	public Compra(Cliente cliente, Date fecha, int puntos) {
		this.cliente = cliente;
		this.fecha = fecha;
		this.puntos = puntos;
	}

	public Compra(Cliente cliente, Date fecha, int puntos, Set<DetalleCompra> detalleCompras) {
		this.cliente = cliente;
		this.fecha = fecha;
		this.puntos = puntos;
		this.detalleCompras = detalleCompras;
	}

	public Integer getIdCompra() {
		return this.idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getPuntos() {
		return this.puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public Set<DetalleCompra> getDetalleCompras() {
		return this.detalleCompras;
	}

	public void setDetalleCompras(Set<DetalleCompra> detalleCompras) {
		this.detalleCompras = detalleCompras;
	}

}
