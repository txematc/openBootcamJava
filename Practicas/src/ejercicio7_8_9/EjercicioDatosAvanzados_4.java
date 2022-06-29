package ejercicio7_8_9;

import java.util.Vector;

public class EjercicioDatosAvanzados_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println(" Vector");

        Vector<Integer> vector = new Vector<Integer>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println("Vector antes de borrar: " + vector);

        vector.remove(2);
        vector.remove(1);

        System.out.println("Vector despues de borrar: " + vector + ", Eliminados el 2 y 3");
        
        
        //Indica cuál es el problema de utilizar un Vector con la capacidad por defecto 
        // si tuviésemos1000 elementos para ser añadidos al mismo.

    System.out.println("Desperdiciamos mucha memoria del sistema, ya que cada vez que se sobrepasa" +
            " el limite establecido (Por defecto, 10) la dimension del vector se duplica.");


	}

}
