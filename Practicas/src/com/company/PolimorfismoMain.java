package com.company;

public class PolimorfismoMain {

	public static void main(String[] args) {
		
		Coche coche1=new Coche();
		CocheElectrico coche2 = new CocheElectrico();
		
		
	// Polimorfismo
		
		Coche coche3= new CocheElectrico();
		System.out.println(coche3);
		System.out.println(coche2);
		System.out.println(coche1);
	}

}
