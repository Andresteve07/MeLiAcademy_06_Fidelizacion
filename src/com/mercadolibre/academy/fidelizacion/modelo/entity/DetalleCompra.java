package com.mercadolibre.academy.fidelizacion.modelo.entity;

public class DetalleCompra implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idDetalleCompra;
	private Compra compra;
	private Producto producto;
	private int cantidad;
	private int puntos;

	public DetalleCompra() {
	}

	public DetalleCompra(Compra compra, Producto producto, int cantidad, int puntos) {
		this.compra = compra;
		this.producto = producto;
		this.cantidad = cantidad;
		this.puntos = puntos;
	}

	public Integer getIdDetalleCompra() {
		return this.idDetalleCompra;
	}

	public void setIdDetalleCompra(Integer idDetalleCompra) {
		this.idDetalleCompra = idDetalleCompra;
	}

	public Compra getCompra() {
		return this.compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPuntos() {
		return this.puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

}
