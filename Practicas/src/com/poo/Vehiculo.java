package com.poo;

public class Vehiculo {
	
	// 1.- atributos
	
	protected String marca;
	protected String modelo;
	protected int cc;
	protected int anyo;
	protected String color;
	protected Boolean sport;
	protected int velocidad;
	protected Motor motor;
	
	// 2.- constructores
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(String marca, String modelo, int cc, int anyo, String color, boolean sport) {
		this.marca = marca;
		this.modelo = modelo;
		this.cc = cc;
		this.anyo = anyo;
		this.color = color;
		this.sport = sport;	
		this.velocidad = 0; //con esto damos por sentado que a crear un objeto su velocidad es 0
	}
	public Vehiculo(String marca, String modelo, Motor motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
	}
	
	// 3.- metodos
	
	public void acelerar(int cantidad){
		this.velocidad += cantidad;		
	}
	
	

}
