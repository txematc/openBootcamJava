package ejercicioPoo;

public class SmartDevice {
	
	//atributos
	
	String SO;
	double pantallaTamano;
	int capacidad;
	int ram;
	String procesador;
	Boolean pantallaTactil;
	Boolean encendido;
	
	//Constructor
	
	public SmartDevice() {
		
	}
	
	 public SmartDevice(String SO, double pantallaTamaño, int capacidad, int ram,
			 String procesador, boolean pantallaTactil) {
		 this.SO = SO;
		 this.pantallaTamano= pantallaTamaño;
		 this.capacidad = capacidad;
		 this.ram = ram;
		 this.procesador = procesador;
		 this.pantallaTactil = pantallaTactil;
		 this.encendido = false;
		 
	 }
	 //Metodos
	  public void encender() {
		  this.encendido= true;
	  }
	  public void  apagar() {
		  this.encendido = false;
	  }
}
