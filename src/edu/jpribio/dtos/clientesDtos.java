package edu.jpribio.dtos;

/**
 * Clase donde se encuentra los atributos del cliente(DTOS)
 * @author jpribio - 10/10/2024
 */
public class clientesDtos {
	long id;
	String nombreCliente="aaaaa";
	String apellidosCliente="aaaaa";
	
	public clientesDtos(long id, String nombreCliente, String apellidosCliente) {
		super();
		this.id = id;
		this.nombreCliente = nombreCliente;
		this.apellidosCliente = apellidosCliente;
	}

	public clientesDtos() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidosCliente() {
		return apellidosCliente;
	}

	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}
	
	
}
