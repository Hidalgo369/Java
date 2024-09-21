package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("Para aliviar el dolor y fiebre");
		productoA.setPrecio(3.5);
		productoA.setStockActual(50);
		
		productoB.setNombre("Jarabe para la tos");
		productoB.setDescripcion("Alivia la tos productiva y elimina el moco");
		productoB.setPrecio(7.5);
		productoB.setStockActual(25);
		
		productoC.setNombre("Vitaminas C");
		productoC.setDescripcion("Fortalece el sistema inmunológico");
		productoC.setPrecio(8.99);
		productoC.setStockActual (20);

		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripción: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock Actual: " + productoA.getStockActual());
		
		System.out.println("_________________________________________");
		
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripción: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock Actual: " + productoB.getStockActual());
		
		System.out.println("_________________________________________");
		
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripción: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock Actual: " + productoC.getStockActual());
	}

}