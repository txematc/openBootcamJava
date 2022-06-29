package datosAvanzadosJava;

import java.math.BigDecimal;

public class DatoBigDecimal {

	public static void main(String[] args) {
		
		//Este tipo de dato avanzado es tanto para matematicas avanzadas o financieras.
		
		BigDecimal valorA= new BigDecimal(0.1f);
		BigDecimal valorB= new BigDecimal(4);
		valorA.multiply(valorB);
		valorA.add(valorB);
		System.out.println(valorA.toString());

	}

}
