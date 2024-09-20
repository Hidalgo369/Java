package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.marca = "Tesla";
		auto1.anio = 2024;
		auto1.precio = 39999.99;
		
		auto2.marca = "Lamborghini";
		auto2.anio = 2024;
		auto2.precio = 50000.50;
		
		System.out.println("Marca: " + auto1.marca);
		System.out.println("Año: " + auto1.anio);
		System.out.println("Precio: " + auto1.precio);
		
		System.out.println("*******************");
		
		System.out.println("Marca: " + auto2.marca);
		System.out.println("Año: " + auto2.anio);
		System.out.println("Precio: " + auto2.precio);
	}

}
