package datosAvanzadosJava;

import java.util.Vector;

public class DatoVectores {

	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<Integer>();
		
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		
		System.out.println(vector);
		
		vector.remove(2);
		System.out.println(vector);
		
		vector.add(3);
		
		System.out.println("vector tamaño: " + vector.size() + " vector capacidad: " + vector.capacity());
		
		for(int i : vector) {
			System.out.println("Valor actual del vector: " +i);
		for(int j=0; j<vector.size(); j++)  {
			System.out.println("El valor de j es: " + vector.get(j));
		}
		}
	}

}
