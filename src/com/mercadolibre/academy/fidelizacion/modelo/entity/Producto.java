package com.mercadolibre.academy.fidelizacion.modelo.entity;

import java.util.HashSet;
import java.util.Set;

public class Producto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idProducto;
	private String detalle;
	private int puntos;
	private Set<DetalleCompra> detalleCompras = new HashSet<DetalleCompra>(0);

	public Producto() {
	}

	public Producto(String detalle, int puntos) {
		this.detalle = detalle;
		this.puntos = puntos;
	}

	public Producto(String detalle, int puntos, Set<DetalleCompra> detalleCompras) {
		this.detalle = detalle;
		this.puntos = puntos;
		this.detalleCompras = detalleCompras;
	}

	public Integer getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
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
