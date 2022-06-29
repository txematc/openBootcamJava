package ejercicio7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;

public class EjercicioDatosAvanzados_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println(" Array y LinkedList");

          ArrayList<String> paises = new ArrayList<String>();
          paises.add("España");
          paises.add("Portugal");
          paises.add("Francia");
          paises.add("Italia");

          LinkedList<String> linkedlist = new LinkedList<String>();

          for (int i = 0; i < paises.size(); i++) {
              linkedlist.add(i, paises.get(i));
          }

          System.out.println("Elementos del Array paises : ");
          for (String elementos : paises) {
              System.out.print(elementos + " ");
          }

          System.out.println("\nElementos de la LinkedList paises:");
          for (String elementos : linkedlist) {
              System.out.print(elementos + " ");
          }

	}

}
