package ejercicioPoo;

public class SmartWatch extends SmartDevice{
    
	String deporte;
	
	public SmartWatch() {
		
	}
	public SmartWatch(String SO, double pantallaTamaño, int capacidad, int ram,
			 String procesador, boolean pantallaTactil, boolean encendido, String deporte) {
		 this.SO = SO;
		 this.pantallaTamano= pantallaTamaño;
		 this.capacidad = capacidad;
		 this.ram = ram;
		 this.procesador = procesador;
		 this.pantallaTactil = pantallaTactil;
		 this.encendido = false;
		 this.deporte = deporte;
	}
}
