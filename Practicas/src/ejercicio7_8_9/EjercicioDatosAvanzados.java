package ejercicio7_8_9;

import java.util.Scanner;

public class EjercicioDatosAvanzados {

	public static void main(String[] args) {
		
		System.out.println("Cadena de texto al reves");
		
		try (Scanner scaner = new Scanner(System.in)) {
			String texto;
			System.out.println("Introducce un texto: ");
			texto = scaner.nextLine();
			
			StringBuilder alreves = new StringBuilder(texto);
			texto = alreves.reverse().toString();
			
			System.out.println(texto);
		}

	}
}

