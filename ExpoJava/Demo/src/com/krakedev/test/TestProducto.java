package com.krakedev.test;

import com.krakedev.producto.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(10,"Arroz");
		
		producto1.setDescripcion("Buena calidad al mejor precio");
		producto1.setPeso(100.50);
		
		System.out.println("Código: " + producto1.getCodigo());
		System.out.println("Nombre: " + producto1.getNombre());
		System.out.println("Descripcion: " + producto1.getDescripcion());
		System.out.println("Peso: " + producto1.getPeso());
	}

}
