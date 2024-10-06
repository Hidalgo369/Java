package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Clientes;
import com.krakedev.persistencia.servicios.AdminClientes;

public class TestInsertarCliente {

	public static void main(String[] args) {
		Clientes c = new Clientes("6749278103", "Bill", "Gates");
		try {
			AdminClientes.insertar(c);

		} catch (Exception e) {
			System.out.println("Error en el sistema, no se registró el cliente: " + e.getMessage());
		}
	}

}
