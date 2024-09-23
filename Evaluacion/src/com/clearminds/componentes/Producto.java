package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void incrementarPrecio(int porcentajeIncremento) {
		precio = (precio * (porcentajeIncremento / 100.0)) + precio;
	}
	
	public void disminuirPrecio(double descuento) {
		precio = precio - descuento;
	}
	
	public Producto(String codigo, String nombre, double precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		
	}
	
	
}
