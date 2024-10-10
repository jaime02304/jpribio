package edu.jpribio.servicios;

/**
 * Interfaz donde se encuentra las cabecera de los metodos menus
 * @author jpribio - 10/10/2024
 */
public interface menuInterfaz {

	/**
	 * Metodo que enseña el menu principal y devuelve la opcion que ha pedido el usuario
	 * @author jpribio - 10/10/2024
	 * @return
	 */
	public byte menuPrincipal();
	
	/**
	 * Metodo que enseña el menu de empleados y devuelve la opcion que ha pedido el usuario
	 * @author jpribio - 10/10/2024
	 * @return
	 */
	public byte menuEmpleado();
	
	/**
	 * Metodo que enseña el menu de gerencia y devuelve la opcion que ha pedido el usuario
	 * @author jpribio - 10/10/2024
	 * @return
	 */
	public byte menuGerencia();
}
