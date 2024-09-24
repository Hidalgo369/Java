package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();

		maquina.agregarCelda(new Celda("1"));
		maquina.agregarCelda(new Celda("2"));
		maquina.agregarCelda(new Celda("3"));
		maquina.agregarCelda(new Celda("4"));
		maquina.agregarCelda(new Celda("5"));
		maquina.agregarCelda(new Celda("6"));

		Producto producto1 = new Producto("A1", "TV", 639.80);
		Producto producto2 = new Producto("A2", "Play Station", 1500.5);
		Producto producto3 = new Producto("A3", "PC gamer", 599.99);
		Producto producto4 = new Producto("A4", "Teclado mecánico", 32.75);
		Producto producto5 = new Producto("A5", "Mouse Inalámbrico", 15);
		Producto producto6 = new Producto("A6", "Pendrive 64GB", 8.99);

		maquina.cargarProducto(producto1, "1", 7);
		maquina.cargarProducto(producto2, "2", 3);
		maquina.cargarProducto(producto3, "3", 45);
		maquina.cargarProducto(producto4, "4", 9);
		maquina.cargarProducto(producto5, "5", 12);
		maquina.cargarProducto(producto6, "6", 82);

		ArrayList<Producto> retornoMenor = maquina.buscarMenores(15);
		System.out.println("Productos menores: " + (retornoMenor.size()));
		for (int i = 0; i < retornoMenor.size(); i++) {
			Producto elementoProducto = retornoMenor.get(i);
			System.out.println("Nombre:" + elementoProducto.getNombre() + " Precio:" + elementoProducto.getPrecio());
		}
	}

}
