package datosAvanzadosJava;

import java.util.HashMap;

import java.util.Map.Entry;

public class DatoMapa {

	public static void main(String[] args) {
		
		HashMap<String, Integer> mapa = new HashMap<String, Integer>();
		mapa.put("clave1", 10);
		mapa.put("clave2", 20);
		mapa.put("clave3", 30);
		mapa.put("clave4", 40);
		
		System.out.println(mapa);
		System.out.println(mapa.get("clave3"));
		
		mapa.replace("clave3", 90);
		System.out.println(mapa.get("clave3"));
		
		mapa.remove("clave3");
		System.out.println(mapa);
		
		for(Entry<?, ?> elemento : mapa.entrySet()) {
			System.out.println("La clave es " + elemento.getKey());
			System.out.println("El valor es " + elemento.getValue());
			
		}
		
	}

}
