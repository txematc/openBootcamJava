package com.company;

public class SentenciaSwitch {

	public static void main(String[] args) {
		String tiempo ="nublado";
		
		switch(tiempo) {
		case "soleado":
			System.out.println("El tiempo es soleado");
			break;
		case "nublado":
			System.out.println("El tiempo es nublado");
			break;
		case "lluvioso":
			System.out.println("El tiempo es lluvioso");
			break;
		default:
			System.out.println("No se ha identificado el clima del lugar escogido");
			
		
		}

	}

}
