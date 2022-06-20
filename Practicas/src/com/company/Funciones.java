package com.company;

public class Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		holaMundo();
		muestraResultado();
	}
	
	public static void holaMundo() {
		System.out.println("Hola mundo desde funciones");
	}
	
	public static int suma(int num1, int num2) {
		return num1+num2;
	}
	
	public static void muestraResultado() {
		int resultado= suma(3,5);
		System.out.println(resultado);
	
	}
	
	
}
