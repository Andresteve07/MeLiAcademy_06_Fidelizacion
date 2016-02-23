package com.mercadolibre.academy.fidelizacion.modelo.entity;

import java.util.HashSet;
import java.util.Set;

public class Direccion implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idDireccion;
	private String calle;
	private int numero;
	private String localidad;
	private String provincia;
	private String pais;
	private Set<Cliente> clientes = new HashSet<Cliente>(0);

	public Direccion() {
	}

	public Direccion(String calle, int numero, String localidad, String provincia, String pais) {
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
	}

	public Direccion(String calle, int numero, String localidad, String provincia, String pais, Set<Cliente> clientes) {
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
		this.clientes = clientes;
	}

	public Integer getIdDireccion() {
		return this.idDireccion;
	}

	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Set<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

}
