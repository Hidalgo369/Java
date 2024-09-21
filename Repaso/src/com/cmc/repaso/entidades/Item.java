package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int vendidos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public int getProductosDevueltos() {
		return productosDevueltos;
	}
	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	public int getVendidos() {
		return vendidos;
	}
	public void setVendidos(int vendidos) {
		this.vendidos = vendidos;
	}
	
	public void Imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Productos actuales: " + productosActuales);
		System.out.println("Productos devueltos: " + productosDevueltos);
		System.out.println("Productos vendidos: " + vendidos);
	}
	
	public void Vender(int vendidos) {
		productosActuales = productosActuales - vendidos;
		this.vendidos = this.vendidos + vendidos;
	}
	
	public void Devolver(int vendidos) {
		productosActuales = productosActuales + vendidos;
		this.vendidos = this.vendidos - vendidos;
		productosDevueltos = productosDevueltos + vendidos;
	}
}
