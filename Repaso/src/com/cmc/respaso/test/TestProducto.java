package com.cmc.respaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto("TV",825.5);
		System.out.println("*******Producto 1*******");
		System.out.println(producto1.getNombre());
		System.out.println(producto1.getPrecio());
		
		Producto producto2 = new Producto();
		producto2.setNombre("Honor 90 Pro");
		producto2.setPrecio(699.99);
		
		System.out.println("*******Producto 2*******");
		System.out.println(producto2.getNombre());
		System.out.println(producto2.getPrecio());
		
		double promo1 = producto1.PrecioPromo(50);
		double promo2 = producto2.PrecioPromo(35);
		System.out.println("*******Descuento*******");
		System.out.println(producto1.getNombre() + " con descuento del 50%, total: " + promo1);
		System.out.println(producto2.getNombre() + " con descuento del 35%, total: " + promo2);
	}
	
}
