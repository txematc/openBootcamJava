package ejercicio7_8_9;

import java.util.ArrayList;

public class EjecicioDatosAvanzados_6 {

	public static void main(String[] args) {
		// Creamos un ArrayList e imprimimos los impares.
		
        System.out.println(" ArrayInt");

        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 1; i < 15; i++) {
            lista.add(i);

            for (int num = 0; num < lista.size(); num++) {

                if (lista.get(num) % 2 == 0) {
                    lista.remove(num);
                }
            }
        }

        System.out.println(lista);

	}

}
