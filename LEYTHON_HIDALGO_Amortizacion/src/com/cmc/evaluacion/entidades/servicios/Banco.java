package com.cmc.evaluacion.entidades.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Banco() {
		clientes = new ArrayList<>();
		prestamos = new ArrayList<>();
	}

	public Cliente buscarCliente(String cedulaCliente) {
		Cliente clienteEncontrado = null;
		if (clientes != null) {
			for (int i = 0; i < clientes.size(); i++) {
				Cliente objetoCliente = clientes.get(i);
				if (objetoCliente.getCedula().equals(cedulaCliente)) {
					clienteEncontrado = objetoCliente;
				}
			}
		}
		return clienteEncontrado;
	}

	public void registrarCliente(Cliente cliente) {
		if (clientes != null && cliente != null) {
			Cliente busquedaCliente = buscarCliente(cliente.getCedula());
			if (busquedaCliente == null) {
				clientes.add(cliente);
			} else {
				System.out.println("Cliente ya existe: " + cliente.getCedula());
			}
		}
	}

	public void asignarPrestamo(String cedulaCliente, Prestamo prestamo) {
		if (clientes != null) {
			Cliente busquedaCliente = buscarCliente(cedulaCliente);
			if (busquedaCliente == null) {
				System.out.println("No es cliente del banco");
			} else {
				prestamo.setCedulaCliente(cedulaCliente);
				prestamos.add(prestamo);
			}
		}
	}

	public ArrayList<Prestamo> buscarPrestamos(String cedulaCliente) {
		ArrayList<Prestamo> prestamosCliente = new ArrayList<>();
		for (int i = 0; i < prestamos.size(); i++) {
			Prestamo prestamo = prestamos.get(i);
			if (prestamo.getCedulaCliente().equals(cedulaCliente)) {
				CalculadoraAmortizacion calculadora = new CalculadoraAmortizacion();
				calculadora.generarTabla(prestamo);
				prestamosCliente.add(prestamo);
				calculadora.mostrarTabla(prestamo);
			}
		}
		if (prestamosCliente.isEmpty()) {
			return null;
		} else {
			return prestamosCliente;
		}
	}

}
