package edu.jpribio.servicios;

import edu.jpribio.controladores.inicioApp;

/**
 * Implementacion que implementa la cabecera de metodos de la interfaz menu
 * @author jpribio - 10/10/2024
 */
public class menuImplementacion implements menuInterfaz{

	public byte menuPrincipal() {
			System.out.println("Elija una opcion de las siguientes");
			System.out.println("Opcion 0. Cerrar aplicacion");
			System.out.println("Opcion 1. Menu empleado");
			System.out.println("Opcion 2. Menu gerencia");
			byte opcion = inicioApp.sc.nextByte();
		return opcion;
	}

	public byte menuEmpleado() {
		System.out.println("Elija una opcion de las siguientes");
		System.out.println("Opcion 0. Volver al menu principal");
		System.out.println("Opcion 1. Añadir compra a un cliente");
		System.out.println("Opcion 2. Calculo total de ventas mensual");
		byte opcion = inicioApp.sc.nextByte();
	return opcion;
	}

	@Override
	public byte menuGerencia() {
		System.out.println("Elija una opcion de las siguientes");
		System.out.println("Opcion 0. Volver al menu principal");
		System.out.println("Opcion 1. Añadir un cliente");
		byte opcion = inicioApp.sc.nextByte();
	return opcion;
	}

}
