package com.uniandes.marketplace.models;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Pedido {

	private double valorTotal;
	private long identificacionCliente;
	private InformacionPago infoPago;
	private List<Producto> productos;
	
	/*
	public Pedido(double valorTotal, long identificacionCliente, InformacionPago infoPago, List<Producto> productos) {
		super();
		this.valorTotal = valorTotal;
		this.identificacionCliente = identificacionCliente;
		this.infoPago = infoPago;
		this.productos = productos;
	}*/

	@JsonProperty("valor_total")
	public double getValorTotal() {
		return valorTotal;
	}

	@JsonProperty("valor_total")
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@JsonProperty("identificacion_usuario")
	public long getIdentificacionCliente() {
		return identificacionCliente;
	}

	public void setIdentificacionCliente(long identificacionCliente) {
		this.identificacionCliente = identificacionCliente;
	}

	@JsonProperty("informacion_pago")
	public InformacionPago getInfoPago() {
		return infoPago;
	}

	public void setInfoPago(InformacionPago infoPago) {
		this.infoPago = infoPago;
	}

	@JsonProperty("productos")
	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
