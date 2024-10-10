package edu.jpribio.servicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import edu.jpribio.controladores.inicioApp;
import edu.jpribio.dtos.clientesDtos;
import edu.jpribio.dtos.comprasDtos;

/**
 * Clase que implementa la interfaz en relacion al empleado
 * 
 * @author jpribio - 10/10/2024
 */
public class empleadoImplementacion implements empleadoInterfaz {

	public void aniadirCompra() {
		System.out.println("a continuacion se mostrara todos los id con su nombre y apellidos");
		//Solo sirve para despues saber si se encuentra en la lista el id que diga el usuario
		ArrayList<Long> listaDeIds= new ArrayList<Long>();
		for(clientesDtos clientes : inicioApp.listaClientes) {
			System.out.println(
				"\n IdCliente: "+clientes.getId()+	"\n Apellidos del clientes"+clientes.getApellidosCliente() +"\n Nombre del cliente"+ clientes.getNombreCliente());
			listaDeIds.add(clientes.getId());
		}
		
		System.out.println("A continuacion por favor dame el id del usuario en relacion a la compra");
		long id = inicioApp.sc.nextLong();
		double precio;
		long idCompra;
		LocalDateTime fechaInstanteDateTime = LocalDateTime.now();
		if(listaDeIds.contains(id)) {
			System.out.println("Dame la cantidad del precio de la compra");
			precio = inicioApp.sc.nextDouble();
			idCompra=idAutogenerado();
			comprasDtos compras = new comprasDtos(idCompra,precio,id,fechaInstanteDateTime);
			inicioApp.listaCompras.add(compras);
		}else {
			System.out.println("No has puesto ningun id que este en la lista mostrada, por favor intentelo en otro momento o mas tarde");
		}		
	}

	/**
	 * metodo que hace el ide autogenerado 
	 * @author jpribio - 10/10/2024
	 * @return
	 */
	private long idAutogenerado() {
		int tamanio = inicioApp.listaCompras.size();
		long id;
		if (tamanio <= 0) {
			id = 1;
		} else {
			id = inicioApp.listaCompras.get(tamanio - 1).getIdCompras() + 1;
		}

		return id;

	}

	public void calculoTotalDelMes() {
		String fechaString;
		//Sirve para hacer una condicion en el while por si el usuario da otro formato al indicado
		String[] arrayCondicionString;
		do {
			System.out.println("Por favor dame la fecha del mes con el siguiente formato MM-yyyy");
			 fechaString = inicioApp.sc.next();
			 arrayCondicionString = fechaString.split("-");
		}while(arrayCondicionString.length<=0);
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM-yyyy");
		double ventasTotalesDelMes=0;
		
		for(comprasDtos compras : inicioApp.listaCompras) {
			if(compras.getFechaInstante().format(formato).equals(fechaString)) {
				ventasTotalesDelMes += compras.getPrecioVenta();
			}
			
		}
		
		System.out.println("Las ventas totales del mes son: " + ventasTotalesDelMes);

	}

}
