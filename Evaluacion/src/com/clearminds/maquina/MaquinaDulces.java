package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getTipo() {
		return saldo;
	}

	public void setTipo(double tipo) {
		this.saldo = tipo;
	}

	public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
		celda1 = new Celda(codigoCelda1);
		celda2 = new Celda(codigoCelda2);
		celda3 = new Celda(codigoCelda3);
		celda4 = new Celda(codigoCelda4);
	}

	public void mostrarConfiguracion() {
		System.out.println("CELDA 1: " + celda1.getCodigo());
		System.out.println("CELDA 2: " + celda2.getCodigo());
		System.out.println("CELDA 3: " + celda3.getCodigo());
		System.out.println("CELDA 4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigoCelda) {
		if (celda1.getCodigo() == codigoCelda) {
			return celda1;
		} else if (celda2.getCodigo() == codigoCelda) {
			return celda2;
		} else if (celda3.getCodigo() == codigoCelda) {
			return celda3;
		} else if (celda4.getCodigo() == codigoCelda) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigoCelda, int cantidadItems) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(producto, cantidadItems);
	}

	public void mostrarProductos() {
		System.out.println("**********CELDA " + celda1.getCodigo());
		System.out.println("Stock: " + celda1.getStock());
		if (celda1.getProducto() != null) {
			System.out.println("Nombre producto:  " + celda1.getProducto().getNombre());
			System.out.println("Precio producto:  " + celda1.getProducto().getPrecio());
			System.out.println("Código producto:  " + celda1.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}

		System.out.println("**********CELDA " + celda2.getCodigo());
		System.out.println("Stock: " + celda2.getStock());
		if (celda2.getProducto() != null) {
			System.out.println("Nombre producto:  " + celda2.getProducto().getNombre());
			System.out.println("Precio producto:  " + celda2.getProducto().getPrecio());
			System.out.println("Código producto:  " + celda2.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}

		System.out.println("**********CELDA " + celda3.getCodigo());
		System.out.println("Stock: " + celda3.getStock());
		if (celda3.getProducto() != null) {
			System.out.println("Nombre producto:  " + celda3.getProducto().getNombre());
			System.out.println("Precio producto:  " + celda3.getProducto().getPrecio());
			System.out.println("Código producto:  " + celda3.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}

		System.out.println("**********CELDA " + celda4.getCodigo());
		System.out.println("Stock: " + celda4.getStock());
		if (celda4.getProducto() != null) {
			System.out.println("Nombre producto:  " + celda4.getProducto().getNombre());
			System.out.println("Precio producto:  " + celda4.getProducto().getPrecio());
			System.out.println("Código producto:  " + celda4.getProducto().getCodigo());
		} else {
			System.out.println("La celda no tiene producto!!!");
		}
		
		System.out.println("Saldo: " + saldo);
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		if (celda1.getCodigo() == codigoCelda) {
			return celda1.getProducto();
		} else if (celda2.getCodigo() == codigoCelda) {
			return celda2.getProducto();
		} else if (celda3.getCodigo() == codigoCelda) {
			return celda3.getProducto();
		} else if (celda4.getCodigo() == codigoCelda) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		return celdaEncontrada.getProducto().getPrecio();
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		if (celda1.getProducto() != null && celda1.getProducto().getCodigo() == codigoProducto) {
			return celda1;
		} else if (celda2.getProducto() != null && celda2.getProducto().getCodigo() == codigoProducto) {
			return celda2;
		} else if (celda3.getProducto() != null && celda3.getProducto().getCodigo() == codigoProducto) {
			return celda3;
		} else if (celda4.getProducto() != null && celda4.getProducto().getCodigo() == codigoProducto) {
			return celda4;
		} else {
			return null;
		}
	}

	public void incrementarProductos(String codigoProducto, int cantidadItems) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		int stockActual = celdaEncontrada.getStock();
		celdaEncontrada.setStock(stockActual + cantidadItems);
	}

	public void vender(String codigoCelda) {
		if (celda1.getCodigo() == codigoCelda) {
			celda1.setStock(celda1.getStock() - 1);
			double precioProducto = celda1.getProducto().getPrecio();
			saldo = saldo + precioProducto;
			
		} else if (celda2.getCodigo() == codigoCelda) {
			celda2.setStock(celda2.getStock() - 1);
			double precioProducto = celda2.getProducto().getPrecio();
			saldo = saldo + precioProducto;
			
		} else if (celda3.getCodigo() == codigoCelda) {
			celda3.setStock(celda3.getStock() - 1);
			double precioProducto = celda3.getProducto().getPrecio();
			saldo = saldo + precioProducto;
			
		} else if (celda4.getCodigo() == codigoCelda) {
			celda4.setStock(celda4.getStock() - 1);
			double precioProducto = celda4.getProducto().getPrecio();
			saldo = saldo + precioProducto;
		}
		//mostrarProductos();
	}

	public double venderConCambio(String codigoCelda, double valor) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		saldo += celdaEncontrada.getProducto().getPrecio();
		double cambio = valor - celdaEncontrada.getProducto().getPrecio();
		return cambio;
	}

	public MaquinaDulces() {

	}

}
