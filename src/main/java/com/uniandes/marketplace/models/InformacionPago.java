package com.uniandes.marketplace.models;

import com.fasterxml.jackson.annotation.JsonProperty;


public class InformacionPago {
	private String numeroTarjeta;
	private String fechaVencimiento;
	private int cvv;
	private String titular;
	
	/*public InformacionPago(String numeroTarjeta, String fechaVencimiento, int cvv, String titular) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.fechaVencimiento = fechaVencimiento;
		this.cvv = cvv;
		this.titular = titular;
	}*/

	@JsonProperty("numero_tarjeta")
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	@JsonProperty("fecha_vencimiento")
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@JsonProperty("cvv")
	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	@JsonProperty("titular")
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
}
