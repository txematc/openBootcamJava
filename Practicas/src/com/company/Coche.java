package com.company;

public class Coche {
	//atributos
	
	
	String marca="";
	String modelo = "";
	String color = "";
	double peso = 0;
	double largo = 0;
	Integer velocidad = 0;
	
	//constructor
	
	public Coche(String marca, String modelo, String color, double peso, double largo) {
		this.marca=marca;
		this.modelo= modelo;
		this.color = color;
		this.peso = peso;
		this.largo = largo;
	}
	public Coche() {
		
	}
		
	//metodos o comportamientos
		
	public void acelerar(Integer cantidad) {
		if (cantidad>0 && cantidad<=120) {
			this.velocidad += cantidad;
		}
	}
@Override
public String toString() {
	return "Coche{ " + "color= " + color + "\""
			+ ", marca =" + marca +"\"" +
			",  modelo = " + modelo + "\"" +
			", peso = " + peso + "\"" +
			", largo= " + largo + "\"" +
			", velodidad de = " + velocidad + "}";		
					}
	
}
