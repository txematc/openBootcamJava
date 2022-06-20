package com.company;

public class CocheElectrico extends Coche{
	String motorElectrico;
	public CocheElectrico() {
		super();
	}
	
	public CocheElectrico(String motorElectrico){
		super();
		this.motorElectrico = motorElectrico;
	}
	
	@Override
	public void acelerar(Integer cantidad) {
		super.acelerar(cantidad);
	}
	
	@Override
	public String toString() {
		return "Coche{ " + "color= " + color + "\""
				+ ", marca =" + marca +"\"" +
				",  modelo = " + modelo + "\"" +
				", peso = " + peso + "\"" +
				", largo= " + largo + "\"" +
				", velodidad de = " + velocidad + "\"" +
				", motorelectrico = " + motorElectrico + "}";	
						}
	
}
