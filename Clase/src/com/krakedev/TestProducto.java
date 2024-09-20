package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.nombre = "Paracetamol";
		productoA.descripcion = "Para aliviar el dolor y fiebre";
		productoA.precio = 3.5;
		productoA.stockActual = 50;
		
		productoB.nombre = "Jarabe para la tos";
		productoB.descripcion = "Alivia la tos productiva y elimina el moco";
		productoB.precio = 7.5;
		productoB.stockActual = 25;
		
		productoC.nombre = "Vitaminas C";
		productoC.descripcion = "Fortalece el sistema inmunológico";
		productoC.precio = 8.99;
		productoC.stockActual = 20;

		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripción: " + productoA.descripcion);
		System.out.println("Precio: " + productoA.precio);
		System.out.println("Stock Actual: " + productoA.stockActual);
		
		System.out.println("_________________________________________");
		
		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripción: " + productoB.descripcion);
		System.out.println("Precio: " + productoB.precio);
		System.out.println("Stock Actual: " + productoB.stockActual);
		
		System.out.println("_________________________________________");
		
		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripción: " + productoC.descripcion);
		System.out.println("Precio: " + productoC.precio);
		System.out.println("Stock Actual: " + productoC.stockActual);
	}

}