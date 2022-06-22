package com.practicas;

public class Estructuras {

	public static void main(String[] args) {
		
		int edad = 19; //imput(int("Introduzca su edad: "));
		
				// aqui el codigo sencillo de if y else
		
		if (edad <=18){
		System.out.println("Es menor de edad");
		}
		else {
			System.out.println("Es mayor de edad");
		}
		
		// aqui el codigo if else if
		
		String dia = "miercoles";
		
		Boolean resultado = dia.equals(dia);
		
		System.out.println(resultado);
		
		if (dia.equals("lunes")) {
			System.out.println("Animo campeón ya queda menos para el finde");
		}else if(dia.equals("martes")) {
			System.out.println("Ya vamos el martes");
		}else if(dia.equals("miercoles")) {
			System.out.println("Ya tenemos media semana");
		}else if(dia.equals("jueves")) {
			System.out.println("Ya casi");
		}else if(dia.equals("viernes")) {
			System.out.println("Al fin viernes");
		}else if(dia.equals("sabado")) {
			System.out.println("Fiestuqui sabado");
		}else if(dia.equals("domingo")) {
			System.out.println("Uff que depre vuelta a empezar");
		}else {
			System.out.println("El día introducido no es un día valido");
		}
		
		switch(dia) {
		case"lunes":
		System.out.println("Ya es lunes!!");
		break;
		case"martes":
			System.out.println("Ya es martes!!");
			break;
		case"miercoles":
			System.out.println("Ya es miercoles!!");
			break;
		case"jueves":
			System.out.println("Ya es jueves!!");
			break;
		case"viernes":
			System.out.println("Ya es viernes!!");
			break;
		case"sabado":
			System.out.println("Ya es sabado!!");
			break;
		case"domingo":
			System.out.println("Ya es domingo!!");
			break;
		default:
			System.out.println("El día introducido no es un día valido");
		}
		
	}

}
