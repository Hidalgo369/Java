package com.cmc.evaluacion.test;

import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.entidades.servicios.CalculadoraAmortizacion;

public class TestCalculadora {

	public static void main(String[] args) {
		Prestamo prestamo = new Prestamo(5000, 12, 12);
		CalculadoraAmortizacion calculadora = new CalculadoraAmortizacion();

		calculadora.generarTabla(prestamo);
		calculadora.mostrarTabla(prestamo);
	}

}
