package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Clientes;
import com.krakedev.persistencia.servicios.AdminClientes;

public class TestActualizarCliente {

	public static void main(String[] args) {
		Clientes c = new Clientes("6749278103", "Naruto", "Uzumaki"); //actualiza buscando al cliente por la cédula

		try {
			AdminClientes.actualizar(c);

		} catch (Exception e) {
			System.out.println("Error en el sistema, no se actualizaron los datos: " + e.getMessage());
		}
	}

}