package ejercicioPoo;



public class Main {

	public static void main(String[] args) {
		
		SmartPhone telefono1 = new SmartPhone("Android",3.5, 32, 6, "intel5", true, false,2);
		SmartWatch pulsera1 = new SmartWatch("Android",3.5, 32, 6, "intel3", true, false,"multideporte");
		
			System.out.println("El teléfono tiene sistema operativo " +telefono1.SO);
			System.out.println("con un tamaño de pantalla de " +telefono1.pantallaTamano + " pulgadas ");
			System.out.print("Y una capacidad de " + telefono1.capacidad +" Gb ");
			System.out.print("con una memoria RAM de " + telefono1.ram +" Gb, ");
			System.out.println("Un procesador" +telefono1.procesador);
			System.out.print("con pantalla tactil " + telefono1.pantallaTactil);
			System.out.println("y con " + telefono1.camaras + " camaras.");
			
			
			System.out.println("La pulsera tiene sistema operativo " + pulsera1.SO);
			System.out.print(", con un tamaño de pantalla " +pulsera1.pantallaTamano + " pulgadas, ");
			System.out.print(" y una capacidad de almacenamiento de " + pulsera1.capacidad + " Gb. ");
			System.out.print("Y una RAM de " +pulsera1.ram +" Gb.");
			System.out.println("Un procesador " + pulsera1.procesador);
			System.out.println("con pantalla tactil " + pulsera1.pantallaTactil);
			System.out.println("Y es " + pulsera1.deporte);
			
		

		SmartDevice smartdevice;
		smartdevice = new SmartPhone("Android",3.5, 32, 6, "intel", true, false,2);
		smartdevice.encender();
		System.out.println("El teléfono esta encendido "+smartdevice.encendido);
		
		smartdevice = new SmartWatch("Appel", 1.2, 8, 2, "intel", true, false, "multideporte");
		smartdevice.apagar();
		System.out.println("La pulsera está encendida? " +smartdevice.encendido);
	}
}

