package com.uniandes.marketplace.models;

public class Producto {
	private int id;
	 private String name;
	 private String description;
	 private double valor;
	 private int cantidad;
	 
	 /*
	 public Producto(int id, String name, String description, double valor, int cantidad) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.valor = valor;
		this.cantidad = cantidad;
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
