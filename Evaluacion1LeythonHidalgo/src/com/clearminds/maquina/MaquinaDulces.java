package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {

		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		Celda codigoCeldaArreglo;
		for (int i = 0; i < celdas.size(); i++) {
			codigoCeldaArreglo = celdas.get(i);
			System.out.println("Celda" + i + ": " + codigoCeldaArreglo.getCodigo());
		}

	}

	public MaquinaDulces() {
		this.celdas = new ArrayList<>();
	}

	public Celda buscarCelda(String codigoCelda) {
		Celda celdaElemento;
		Celda celdaEncontrada = null;
		for (int i = 0; i < celdas.size(); i++) {
			celdaElemento = celdas.get(i);
			if (celdaElemento.getCodigo().equals(codigoCelda)) {
				celdaEncontrada = celdaElemento;
				return celdaEncontrada;
			}
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidadItems) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, cantidadItems);
		} else {
			System.out.println("Celda con código " + codigoCelda + " no encontrada.");
		}

	}

	public void mostrarProductos() {
		for (int i = 0; i < celdas.size(); i++) {
			Celda elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() != null) {
				System.out.println("Código:" + elementoCelda.getCodigo() + " Stock:" + elementoCelda.getStock()
						+ " Producto:" + elementoCelda.getProducto().getNombre() + " Precio:"
						+ elementoCelda.getProducto().getPrecio());

			} else {
				System.out.println("Código: " + elementoCelda.getCodigo() + " Stock: " + elementoCelda.getStock()
						+ " Sin producto asignado");
				System.out.println(" ");
			}
		}
		System.out.println("Saldo: " + saldo);
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() != null && elementoCelda.getCodigo().equals(codigoCelda)) {
				Producto productoEncontrado = elementoCelda.getProducto();
				return productoEncontrado;
			}
		}
		return null;
	}

	public double consultarPrecio(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		return celdaEncontrada.getProducto().getPrecio();
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		for (int i = 0; i < celdas.size(); i++) {
			Celda elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() != null && elementoCelda.getProducto().getCodigo().equals(codigoProducto)) {
				return elementoCelda;
			}
		}
		return null;
	}

	public void incrementarProductos(String codigoProducto, int cantidadItems) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(cantidadItems);
	}

	public void vender(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		saldo += celdaEncontrada.getProducto().getPrecio();
		// mostrarProductos();
	}

	public double venderConCambio(String codigoCelda, double valorCliente) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		saldo += celdaEncontrada.getProducto().getPrecio();
		double cambio = valorCliente - celdaEncontrada.getProducto().getPrecio();
		return cambio;
	}

	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> productosMenores = new ArrayList<>();
		for (int i = 0; i < celdas.size(); i++) {
			Producto elementoProducto = celdas.get(i).getProducto();
			if (elementoProducto != null && elementoProducto.getPrecio() <= limite) {
				productosMenores.add(elementoProducto);
			}
		}
		return productosMenores;
	}
}
