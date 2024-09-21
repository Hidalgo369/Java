package com.cmc.respaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion valor1 = new Validacion();
		boolean resultado = valor1.validarMonto(36.99);
		System.out.println("Monto validado: " + resultado);
	}

}
