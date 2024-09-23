package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {

	public static void main(String[] args) {
		Celda celda = new Celda("A1");
		System.out.println(celda.getProducto().getNombre());// Esta línea arroja una excepción del tipo
															// NullPointerException, porque al invocar el método
															// getProducto() del objeto celda, éste está retornado un
															// valor nulo

		System.out.println("CELDA:" + celda.getProducto());
		System.out.println("Nombre Producto:" + celda.getProducto().getNombre());
		System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:" + celda.getProducto().getCodigo());
		System.out.println("STOCK:" + celda.getStock());
		System.out.println("*************************************");
	}

}
