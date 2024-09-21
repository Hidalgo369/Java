package com.krakedev.testdemo;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(10,"Arroz");
		
		producto1.setDescripcion("Mejor calidad al mejor precio");
		producto1.setPeso(15.5);
		
		System.out.println("Código: " + producto1.getCodigo());
		System.out.println("Nombre: " + producto1.getNombre());
		System.out.println("Descripción: " + producto1.getDescripcion());
		System.out.println("Peso: " + producto1.getPeso());
	}

}
