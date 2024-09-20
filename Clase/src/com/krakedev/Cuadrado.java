package com.krakedev;

public class Cuadrado {
	
	public int lado;
	
	public double calcularArea() {
		
		double cuadrado = lado * lado;
		return cuadrado;
		
	}
	
	public double calcularPerimetro() {
		
		double perimetro = lado * 4;
		return perimetro;
	}
}
