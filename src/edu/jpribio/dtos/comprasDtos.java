package edu.jpribio.dtos;

import java.time.LocalDateTime;

/**
 * Clase donde se encuentra los atributos de las compras
 * @author jpribio - 10/10/2024
 */
public class comprasDtos {
	long idCompras;
	double precioVenta=0;
	long idCliente;
	LocalDateTime fechaInstante = LocalDateTime.now();
	
	
	public long getIdCompras() {
		return idCompras;
	}
	public void setIdCompras(long idCompras) {
		this.idCompras = idCompras;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public LocalDateTime getFechaInstante() {
		return fechaInstante;
	}
	public void setFechaInstante(LocalDateTime fechaInstante) {
		this.fechaInstante = fechaInstante;
	}
	public comprasDtos(long idCompras, double precioVenta, long idCliente, LocalDateTime fechaInstante) {
		super();
		this.idCompras = idCompras;
		this.precioVenta = precioVenta;
		this.idCliente = idCliente;
		this.fechaInstante = fechaInstante;
	}
	public comprasDtos() {
		super();
	}
	
	
	

}
