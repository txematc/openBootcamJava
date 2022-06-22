package com.poo;

public class Main {

	public static void main(String[] args) {
		//clase identificador = new Clase
		
		Motor motor1 = new Motor("Ferrari",300, 27.2, 10);
		Vehiculo renaultMegane = new Vehiculo("Renault", "Laguna", motor1);
		
		// crear un objeto con constructor con parametros
		Vehiculo peugeot308 = new Vehiculo("Peugeot", "308", 2600,2020, "verde",false);
		
	System.out.println("La marca del coche es "+ peugeot308.marca);
	System.out.println("El modelo del coche es " + peugeot308.modelo);
	System.out .println("Tiene una cilindrada de " + peugeot308.cc +" centrimetros cubicos");
	System.out.println("Fabricado en el año " + peugeot308.anyo);
	System.out.println("De color " + peugeot308.color);
	System.out.println("Es un modelo deportivo? " + peugeot308.sport);
	peugeot308.acelerar(50);
	System.out.println("Ahora lleva una velocidad de " + peugeot308.velocidad + "Km/h");
	
	System.out.print("El coche es un " + renaultMegane.marca + " ");
	System.out.println(renaultMegane.modelo);
	System.out.println("Que lleva un motor "+renaultMegane.motor.modeloMotor);
	System.out.print("Con una potencia de " + renaultMegane.motor.potencia + "CV ");
	System.out.println("Y un par motor de " + renaultMegane.motor.parmotor);
	System.out.println("Y con " +renaultMegane.motor.cilindros + " en V.");
	
	
	//herencia
	
	Moto moto1 = new Moto();
	moto1.marca = "Honda";
	System.out.println(moto1.marca);
	moto1.maleta = true;
	System.out.println(moto1.maleta);

	
	//polimorfismo
	
	Vehiculo vehiculo;
	vehiculo = new Moto();
	vehiculo.acelerar(50);
	
	vehiculo = new Coche();
	vehiculo.acelerar(50);
	
	vehiculo = new Camion();
	vehiculo.acelerar(50);
	System.out.println(vehiculo.velocidad);
	
	// las clases abstractas no se pueden estanciar, solo instancian las clases hijas
	
	}

}
