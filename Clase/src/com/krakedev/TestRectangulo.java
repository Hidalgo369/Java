package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		r1.base = 10;
		r1.altura = 5;
		
		r2.base = 12;
		r2.altura = 3;
		
		int area1 = r1.calcularArea();
		int area2 = r2.calcularArea();
		
		System.out.println("Área de r1: " + area1);
		System.out.println("Área de r2: " + area2);
		
		Rectangulo r3 = new Rectangulo();
		r3.base = 4;
		r3.altura = 2;
		double area3 = r3.calcularPerimetro();
		System.out.println("Perímetro: " + area3);
		
		Rectangulo r4 = new Rectangulo();
		r4.base = 4;
		double area4 = r4.calcularAreaCuadrado();
		System.out.println("Área de un cuadrado: " + area4);
	}

}
