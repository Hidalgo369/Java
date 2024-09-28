package com.cmc.evaluacion.entidades;

public class Cuota {
	private int numero;
	private double cuota;
	private double inicio;
	private double interes;
	private double abonoCapital;
	private double saldo;

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public double getInicio() {
		return inicio;
	}

	public void setInicio(double inicio) {
		this.inicio = inicio;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getAbonoCapital() {
		return abonoCapital;
	}

	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cuota(int numero) {
		this.numero = numero;
	}

	public void mostrarPrestamo() {
		Utilitario valorRedondeado = new Utilitario();
		valorRedondeado.redondear(cuota);
		valorRedondeado.redondear(inicio);
		valorRedondeado.redondear(interes);
		valorRedondeado.redondear(abonoCapital);
		valorRedondeado.redondear(saldo);
		System.out.println(numero + "  |  " + cuota + "  |  " + inicio + "  |  " + interes + "  |  "
				+ abonoCapital + "  |  " + saldo);
	}

}
