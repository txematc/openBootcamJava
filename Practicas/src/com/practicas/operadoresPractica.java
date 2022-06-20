package com.practicas;

public class operadoresPractica {

	public static void main(String[] args) {
		//aritmeticos
		int num1 = 10;
		int num2 = 5;
		int resultado = num1 + num2;
		System.out.println(num2 + num1);
		System.out.println(num1 + num2 + 5.789);
		System.out.println(resultado);
		anadirMenu();
		String menu = getMenu();
		System.out.println(menu);
		double precio = getPrecio();
		System.out.println(precio);
		imprimirSaludoBuenosDias("OpenBootcamp");
		
		
	}
		
		//Funciones
		
		static void imprimirSaludoBuenosDias(String name) {
			System.out.println("Buenos dias " + name);
		}
	
		static double getPrecio() {
			return 19.99;
		}
	
		 static void anadirMenu(){
			System.out.println("Bienvenido a la zapateria");
			System.out.println("Ver zapatos");
			System.out.println("escoger zapatos");
			System.out.println("comprar zapatos");
		
			
	
	}
		 static String getMenu() {
			 return "Bienvenido a la zapateria \n 1- Ver zapatos \n 2- escoger zapatos \n 3- comprar zapatos";
			 
		 }
}
