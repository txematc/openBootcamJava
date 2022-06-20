package com.company;

public class CocheServiceClasicoimpl implements CocheServer {

	@Override
	public Coche crearCocheDemo() {
		
		return new CocheElectrico();
	}

		
		
}
