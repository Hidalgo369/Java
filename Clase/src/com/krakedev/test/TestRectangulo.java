package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		r1.setBase(10);
		r1.setAltura(5);
		
		r2.setBase(12);
		r2.setAltura(3);
		
		int area1 = r1.calcularArea();
		int area2 = r2.calcularArea();
		
		System.out.println("Área de r1: " + area1);
		System.out.println("Área de r2: " + area2);
		
		Rectangulo r3 = new Rectangulo();
		r3.setBase(4);
		r3.setAltura(2);
		double area3 = r3.calcularPerimetro();
		System.out.println("Perímetro: " + area3);
		
	}

}
