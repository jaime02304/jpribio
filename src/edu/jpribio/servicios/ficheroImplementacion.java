package edu.jpribio.servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Implementacion que implementa la interfaz de fichero
 * @author jpribio - 10/10/2024
 */
public class ficheroImplementacion implements ficheroInterfaz{

	public void ficheroLog(String conteString) {
		String fichero = "C:\\Users\\jpribio\\DesarrolloWebServicio\\edu.jpribio\\src\\auditoria\\fichero.txt";
		
		try {
			PrintWriter escritor = new PrintWriter(new FileWriter(fichero,true));
			escritor.println(conteString);
			escritor.close();
		} catch (IOException e) {
			System.err.println("Ha ocurrido un error en el fichero, por favor espere 5 minutos");
		}
		
		
	}

}
