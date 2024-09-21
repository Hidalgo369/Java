package com.cmc.respaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1 = new Item();
		item1.setNombre("Mesa");
		item1.setProductosActuales(20);
		item1.setProductosDevueltos(10);
		item1.setVendidos(10);
		System.out.println("********PRODUCTO 1*******");
		item1.Imprimir();
		
		System.out.println(" ");
		System.out.println("Vendidos Producto 1");
		item1.Vender(7);
		item1.Imprimir();
		
		System.out.println(" ");
		System.out.println("Devueltos Producto 1");
		item1.Devolver(7);
		item1.Imprimir();
		
		System.out.println(" ");
		System.out.println("********PRODUCTO 2*******");
		Item item2 = new Item();
		item2.setNombre("Mueble");
		item2.setProductosActuales(18);
		item2.setProductosDevueltos(3);
		item2.setVendidos(10);
		item2.Imprimir();
		
		System.out.println(" ");
		System.out.println("Vendidos Producto 2");
		item2.Vender(9);
		item2.Imprimir();
		
		System.out.println(" ");
		System.out.println("Devueltos Producto 2");
		item2.Devolver(2);
		item2.Imprimir();
	}

}
