package datosAvanzadosJava;

import java.util.ArrayList;
import java.util.LinkedList;

public class DatoArrayList {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Txema");
		lista.add("Soraya");
		lista.add("Claudia");
		lista.add("Patry");
		lista.add("Liam");
		
		System.out.println("Elementos " + lista);
		
		for(String nombre:lista) {
			System.out.println(nombre);
		}
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		LinkedList<String> listaenlazada= new LinkedList<String>();
		listaenlazada.add("Pepe");
		listaenlazada.add("Javi");
		listaenlazada.add("Gonzalo");
		listaenlazada.add("Ana");
		
		System.out.println("Elementos: " + listaenlazada);
		
		for(String primos:listaenlazada) {
			System.out.println("Primo " + primos);
		}
	}

}
