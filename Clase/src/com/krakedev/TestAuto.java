package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.setMarca("Tesla");
		auto1.setAnio(2024);
		auto1.setPrecio(39999.99);
		
		auto2.setMarca("Lamborghini");
		auto2.setAnio(2024);
		auto2.setPrecio(50000.50);
		
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());
		
		System.out.println("*******************");
		
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());
	}

}
