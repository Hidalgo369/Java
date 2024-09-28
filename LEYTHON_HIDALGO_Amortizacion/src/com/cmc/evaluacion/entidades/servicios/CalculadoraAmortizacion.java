package com.cmc.evaluacion.entidades.servicios;

import com.cmc.evaluacion.entidades.Prestamo;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Utilitario;

public class CalculadoraAmortizacion {

	public double calcularCuota(Prestamo prestamo) {
		Utilitario valorRedondeado = new Utilitario();
		double cuota = 0;
		if (prestamo != null) {
			double Co = prestamo.getMonto();
			double i = prestamo.getInteres();
			int n = prestamo.getPlazo();
			if (i > 0 && n > 0) {
				i = (i / 12) / 100;
				cuota = (Co * i) / (1 - Math.pow(1 + i, -n));
			}
		}
		return valorRedondeado.redondear(cuota);
	}

	public void generarTabla(Prestamo prestamo) {
		prestamo.setCuotas(new ArrayList<>());

		double cuotaFija = calcularCuota(prestamo);
		double saldoInicial = prestamo.getMonto();

		for (int i = 0; i < prestamo.getPlazo(); i++) {
			Cuota cuota = new Cuota(i + 1);
			cuota.setCuota(cuotaFija);

			if (i == 0) {
				cuota.setInicio(saldoInicial);
			} else {
				Cuota cuotaAnterior = prestamo.getCuotas().get(i - 1);
				cuota.setInicio(cuotaAnterior.getSaldo());
			}

			prestamo.getCuotas().add(cuota);

			Cuota cuotaSiguiente;

			if (i < prestamo.getPlazo() - 1) {
				cuotaSiguiente = new Cuota(i + 2);
			} else {
				cuotaSiguiente = null;
			}
			calcularValoresCuota(prestamo.getInteres(), cuota, cuotaSiguiente);
		}

		ajustarUltimaCuota(prestamo);
	}

	private void calcularValoresCuota(double interesAnual, Cuota cuota, Cuota cuotaSiguiente) {
		double interesMensual = (interesAnual / 12) / 100;
		double interesCuota = cuota.getInicio() * interesMensual;
		double abonoCapital = cuota.getCuota() - interesCuota;
		double saldoFinal = cuota.getInicio() - abonoCapital;

		cuota.setInteres(interesCuota);
		cuota.setAbonoCapital(abonoCapital);
		cuota.setSaldo(saldoFinal);

		if (cuotaSiguiente != null) {
			cuotaSiguiente.setInicio(saldoFinal);
		}
	}

	private void ajustarUltimaCuota(Prestamo prestamo) {
		Cuota ultimaCuota = prestamo.getCuotas().get(prestamo.getPlazo() - 1);
		double saldoPendiente = ultimaCuota.getSaldo();
		ultimaCuota.setCuota(ultimaCuota.getCuota() + saldoPendiente);
		ultimaCuota.setSaldo(0);
	}

	public void mostrarTabla(Prestamo prestamo) {
		System.out.println("Tabla de Amortización:");
		System.out.println("Número | Cuota | Inicio | Interés | Abono | Saldo ");

		int numeroCuota = 1;

		for (int i = 0; i < prestamo.getCuotas().size(); i++) {
			Cuota objetoCuota = prestamo.getCuotas().get(i);
			Utilitario elementoRedondeado = new Utilitario();
			double cuota = elementoRedondeado.redondear(objetoCuota.getCuota());
			double inicio = elementoRedondeado.redondear(objetoCuota.getInicio());
			double interes = elementoRedondeado.redondear(objetoCuota.getCuota());
			double abono = elementoRedondeado.redondear(objetoCuota.getAbonoCapital());
			double saldo = elementoRedondeado.redondear(objetoCuota.getSaldo());

			System.out.print(numeroCuota + "  |  " + cuota + "  |  " + inicio + "  |  " + interes + "  |  " + abono
					+ "  |  " + saldo + "\n");
			numeroCuota++;
		}
	}

}
