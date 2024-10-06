package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Clientes;
import com.krakedev.persistencia.servicios.AdminClientes;

public class TestConsultarCliente {

	public static void main(String[] args) {
		try {
			Clientes cliente = AdminClientes.consultar("0123456789");
			System.out.println(cliente.toString());
		} catch (Exception e) {
			System.out.println("Error en el sistema, no se encontró al clientr en la base de datos: " + e.getMessage());
		}
	}

}