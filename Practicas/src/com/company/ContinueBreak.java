package com.company;

public class ContinueBreak {

	public static void main(String[] args) {
		int cont =0;
		while(cont<10) {
			cont ++;
			if (cont==6)
				//continue; //con este continue saltaria la linea 6
				break;
		System.out.println("Estamos por el contador : " + cont);
		}
	}

}
