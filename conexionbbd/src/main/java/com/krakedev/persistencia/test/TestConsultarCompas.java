package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Compras;
import com.krakedev.persistencia.servicios.AdminCompras;

public class TestConsultarCompas {

	public static void main(String[] args) {
		try {
			Compras compra = AdminCompras.consultar("1");
			System.out.println(compra.toString());
		} catch (Exception e) {
			System.out.println("Error en el sistema, no se encontró la compra en la base de datos: " + e.getMessage());
		}
	}

}