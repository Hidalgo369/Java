package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		Cuadrado r1 = new Cuadrado();
		r1.lado = 4;
		double area1 = r1.calcularArea();
		System.out.println("Área del cuadrado: " + area1);
		
		Cuadrado r2 = new Cuadrado();
		r2.lado = 3;
		double perimetro1 = r2.calcularPerimetro();
		System.out.println("Perímetro del cuadrado: " + perimetro1);
		
	}

}