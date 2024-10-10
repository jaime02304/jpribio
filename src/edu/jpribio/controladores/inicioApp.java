package edu.jpribio.controladores;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import edu.jpribio.dtos.clientesDtos;
import edu.jpribio.dtos.comprasDtos;
import edu.jpribio.servicios.empleadoImplementacion;
import edu.jpribio.servicios.empleadoInterfaz;
import edu.jpribio.servicios.ficheroImplementacion;
import edu.jpribio.servicios.ficheroInterfaz;
import edu.jpribio.servicios.gerenciaImplementacion;
import edu.jpribio.servicios.gerenciaInterfaz;
import edu.jpribio.servicios.menuImplementacion;
import edu.jpribio.servicios.menuInterfaz;

/**
 * Clase que contiene el metodo main de la aplicacion
 * 
 * @author jpribio - 10/10/2024
 */
public class inicioApp {

	//Aqui se encuentra toda la parte estatica de la aplicacion
	public static Scanner sc = new Scanner(System.in);
	public static List<clientesDtos> listaClientes = new ArrayList<clientesDtos>();
	public static List<comprasDtos> listaCompras = new ArrayList<comprasDtos>();

	/**
	 * Metodo main que se encuentra todo el procedimiento de la aplicqacion 
	 * @author jpribio - 10/10/2024
	 * @param args
	 */
	public static void main(String[] args) {

		menuInterfaz mi = new menuImplementacion();
		gerenciaInterfaz ge = new gerenciaImplementacion();
		empleadoInterfaz em = new empleadoImplementacion();
		ficheroInterfaz fi = new ficheroImplementacion();

		//Variables
		byte opcionMenuPrincipal;
		byte opcionMenusSecundarios;
		boolean cerrarMenu = false;

		try {
			do {

				switch (opcionMenuPrincipal = mi.menuPrincipal()) {
				case 0:
					fi.ficheroLog("Opcion 0. Cerrar menu");
					System.out.println("La aplicacion se cerrara a continuacion, que tenga buen dia.");
					cerrarMenu = true;
					break;
				case 1:
					// menu empleado
					fi.ficheroLog("Opcion 1. Menu Empleado");
					if (listaClientes.size() > 0) {
						switch (opcionMenusSecundarios = mi.menuEmpleado()) {
						case 0:
							fi.ficheroLog("Opcion 1. Menu Empleado // Volver. Opcion 1.0");
							System.out.println("A continuacion volvera al menu principal");
							break;
						case 1:
							fi.ficheroLog("Opcion 1. Menu Empleado // Añadir compra. Opcion 1.1");
							em.aniadirCompra();
							for(comprasDtos com : listaCompras) {
								System.out.println(com.getIdCompras());
							}
							break;
						case 2:
							// Calculo total de ventas mensual
							fi.ficheroLog("Opcion 1. Menu Empleado // Calculo total del mes. Opcion 1.2");
							em.calculoTotalDelMes();
							break;

						default:
							fi.ficheroLog("Opcion equivocada, mensaje predefinido");
							System.out.println(
									"No has elegido ninguna opcion correcta se te devolvolvera al menu principal");
							break;
						}
					} else {
						System.out.println(
								"No hay ningun usuario para hañadirle una compra por lo tanto tampoco se podra hacer el calculo de ventas");
					}
					break;
				case 2:
					// Menu gerencia
					fi.ficheroLog("Opcion 2. Menu Gerencia");
					switch (opcionMenusSecundarios = mi.menuGerencia()) {
					case 0:
						fi.ficheroLog("Opcion 2. Menu Empleado // Volver. Opcion 2.0");
						System.out.println("A continuacion volvera al menu principal");
						break;
					case 1:
						// Añadir cliente
						fi.ficheroLog("Opcion 2. Menu Gerencia // añadir cliente. Opcion 2.1");
						ge.aniadirCliente();
						break;
					default:
						fi.ficheroLog("Opcion equivocada, mensaje predefinido");
						System.out
								.println("No has elegido ninguna opcion correcta se te devolvolvera al menu principal");
						break;
					}
					break;
				default:
					fi.ficheroLog("Opcion equivocada, mensaje predefinido");
					System.out.println("No has elegido una opcion correcta, por favor intentelo de nuevo \n");
					break;
				}
			} while (!cerrarMenu);
		} catch (Exception e) {
			System.out.println("Ha habido un error en la aplicacion, intentelo de nuevo mas tarde");
		}
	}

}
