package ejercicio7_8_9;

public class EjercicioDatosAvanzados3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println(" Array Bidimensional");
		
		  //Inicializamos el array bidimensional
		  
          Integer[][] numeros = {
                  {2, 12, 22},
                  {20, 30, 40}
          }; 

          for (int i = 0; i < numeros.length; i++) {

              for (int y = 0; y < numeros[i].length; y++) {

                  System.out.println("Fila: " + (i + 1) + " | Columna: " + (y + 1) +
                          "\nEl valor es: " + numeros[i][y] + "\n");
              }
          }

	}

}
