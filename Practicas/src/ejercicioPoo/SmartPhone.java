package ejercicioPoo;

public class SmartPhone extends SmartDevice {
	
	int camaras;
	
	public SmartPhone() {
		
	}
	 
	public SmartPhone(String SO, double pantallaTamaño, int capacidad, int ram,String procesador, boolean pantallaTactil, boolean encendido, int camaras) {
		 this.SO = SO;
		 this.pantallaTamano= pantallaTamaño;
		 this.capacidad = capacidad;
		 this.ram = ram;
		 this.procesador = procesador;
		 this.pantallaTactil = pantallaTactil;
		 this.encendido = false;
		 this.camaras = camaras;
	}

}
