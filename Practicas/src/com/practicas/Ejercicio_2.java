package com.practicas;

public class Ejercicio_2 {

	public static void main(String[] args) {
		precioIva();

	}
	
	static double precioIva() {
		double precio = 19.99;
		double precioTotal= precio  + (precio * 0.21); 
		System.out.println(precioTotal + "€");
		return precioTotal;
	}

}
