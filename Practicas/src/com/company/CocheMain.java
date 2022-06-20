package com.company;

public class CocheMain {

	public static void main(String[] args) {
		Coche cocheObj = new Coche("Peugeot","308 sw", "crudo", 1200 ,2500);
		cocheObj.acelerar(100);
		System.out.println(cocheObj);
		CocheElectrico cocheElectrico = new CocheElectrico();
		cocheElectrico.motorElectrico = "Ejemplo de motor";
		cocheElectrico.marca = "Honda";
		cocheElectrico.modelo = "Civic";
		System.out.println(cocheElectrico);
		cocheElectrico.acelerar(50);
		System.out.println(cocheElectrico);
	}
	
}
