package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminClientes;

public class TestEliminarCliente {

	public static void main(String[] args) {
		try {
			AdminClientes.eliminar("6749278103");
		} catch (Exception e) {
			System.out.println("Error en el sistema, no se eliminó al cliente: " + e.getMessage());
		}
	}

}