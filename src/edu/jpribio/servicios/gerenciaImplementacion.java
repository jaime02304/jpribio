package edu.jpribio.servicios;

import edu.jpribio.controladores.inicioApp;
import edu.jpribio.dtos.clientesDtos;

/**
 * Clase que implementa la interfaz de gerencia
 * @author jpribio - 10/10/2024
 */
public class gerenciaImplementacion implements gerenciaInterfaz{

	public void aniadirCliente() {
		String afirmacionString;
	do {
		System.out.println("Aqui podras añadir un nuevo cliente.");
		inicioApp.sc.nextLine();
		System.out.println("¿Podrias darme los apellidos del nuevo usuario?");
		String apellidoString = inicioApp.sc.nextLine();
		System.out.println("¿Podrias darme el nombre del nuevo usuario?");
		String nombreString = inicioApp.sc.next();
		long id = idAutonumerico();
		clientesDtos cliente = new clientesDtos(id,nombreString,apellidoString);
		inicioApp.listaClientes.add(cliente);
		System.out.println("¿Quieres añadir un nuevo cliente? si/no");
		afirmacionString= inicioApp.sc.next();
	} while (afirmacionString.equals("si"));
		
	}
	
	/**
	 * Metodo privado que hace el id univoco y autogenerado
	 * @author jpribio - 10/10/2024
	 * @return
	 */
	private long idAutonumerico() {
		int tamanioLista = inicioApp.listaClientes.size();
		long id;
		
		if(tamanioLista<=0) {
			id=1;
		}else {
			id=inicioApp.listaClientes.get(tamanioLista - 1).getId() + 1;
		}
		
		return id;
	}

}
