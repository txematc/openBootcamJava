package datosAvanzadosJava;

public class DatoArrays {

	public static void main(String[] args) {
		
		int array1[] = new int[5];
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		array1[3]=4;
		array1[4]=5;
		
		
		for(int i:array1) {
			System.out.println(i);
		}
		
		String array2[] = {"Pepe", "Javi", "Gonzalo","Ana"};
		
		for(String array:array2) {
			System.out.println("Nombre actual " + array);
		}
		System.out.println("La longitud del array es " + array2.length);
		
		for(int i=0; i< array2.length; i++) {
			System.out.println("El nombre actual es : " + array2[i] + " en posición " + i);	
		}
		
		// Array bidimensional
		
		int arrayBidi[][] = new int[2][4];
		
		arrayBidi[0][0]=1;
		arrayBidi[0][1]=2;
		arrayBidi[0][2]=3;
		arrayBidi[0][3]=4;
		
		arrayBidi[1][0]=10;
		arrayBidi[1][1]=20;
		arrayBidi[1][2]=30;
		arrayBidi[1][3]=40;
		
		
		for(int i=0; i<arrayBidi.length; i++) {
			System.out.println("El valor de i es : " + i);
			for(int j=0; j<arrayBidi[i].length; j++) {
				System.out.println("Estoy en i: " + i +" y en j: " + j);
				System.out.println(arrayBidi[i][j]);
			}
		}
		
		
	}

}
