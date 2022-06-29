package datosAvanzadosJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class EntradaSalida {

	public static void main(String[] args) {
		try {
		
		try (InputStream fichero = new FileInputStream( "C:\\Users\\txema\\Documents\\Electronic Arts\\Los Sims 4\\Mods\\Resource")) {
			try {
				int dato = fichero.read();
				while(dato != -1){
					System.out.println((char)dato);				
				}
			}catch(IOException e) {
				System.out.println("Aqui tenemos un error " + e.getMessage());
			}
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		}catch(FileNotFoundException e){
			System.out.println("Oye que el programa da error "  + e.getMessage());
		}
		
	}

}
