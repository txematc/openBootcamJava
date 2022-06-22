package com.practicas;

public class BuclesMain {

	public static void main(String[] args) {
		
		//comenzamos las estructuras de control de repetición con el for
		
		for (int i=0; i<10; i++) {
			System.out.println("El valor de i es " + i );
		}
		
		String[]nombres = {"Pepe","Txema","Juan","Pedro"};
		
		for (int i=0; i< nombres.length; i++) {
			
			System.out.println(nombres[i]);
		}
		int contador = 0;
		while(contador<5) {
			contador++;
			System.out.println("El valor de contador es : " + contador);
		}
	}

}
