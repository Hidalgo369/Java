package com.cmc.evaluacion.entidades;

import com.cmc.evaluacion.entidades.servicios.CalculadoraAmortizacion;

public class TestImpresion {

	public static void main(String[] args) {
		Cuota numeroCuota = new Cuota(1);
		Prestamo prestamo = new Prestamo(5000, 12, 12);
		CalculadoraAmortizacion calculadora = new CalculadoraAmortizacion();

		double cuota = calculadora.calcularCuota(prestamo);

		double valorCapitalInicio = 5000;
		numeroCuota.setCuota(cuota);
		numeroCuota.setInicio(valorCapitalInicio);
		numeroCuota.setInteres(valorCapitalInicio * (1 / 100.0));
		numeroCuota.setAbonoCapital(numeroCuota.getCuota() - numeroCuota.getInteres());
		numeroCuota.setSaldo(numeroCuota.getInicio() - numeroCuota.getAbonoCapital());

		numeroCuota.mostrarPrestamo();
	}

}
