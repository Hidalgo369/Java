package com.krakedev;

public class Cuadrado {
	
	private int lado;
	/*public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}*/

	public Cuadrado(int lado) {
		this.lado = lado;
	}
	
	public Cuadrado() {
		this.lado = 3;
	}
	
	public double calcularArea() {
		double cuadrado = lado * lado;
		return cuadrado;
	}
	
	public double calcularPerimetro() {
		double perimetro = lado * 4;
		return perimetro;
	}
}
