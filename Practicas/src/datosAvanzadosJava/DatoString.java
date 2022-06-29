package datosAvanzadosJava;

public class DatoString {

	public static void main(String[] args) {
		
		var cadena = "Esto es una cadena de Texto";
		
		int cadenaLen = cadena.length();
		System.out.println("La longitud de la cadena es : " + cadenaLen);
		
		String cadenaMinusculas = cadena.toLowerCase();
		System.out.println("Ponemos todo en minusculas " + cadenaMinusculas);
		
		String cadenaMayu = cadena.toUpperCase();
		System.out.println("Y ahora todo en mayusculas " + cadenaMayu);
		
		Boolean resultado= cadena.startsWith("Est");
			if (resultado) {
				System.out.println("la cadena empieza por Est  ");
							
				}else {
					System.out.println("No comienza por Est  ");
			}
		for (int i = 0; i< cadena.length(); i++) {
			
		System.out.println("El caracter actual es : " + cadena.charAt(i));
		}
	}
}
		

	


