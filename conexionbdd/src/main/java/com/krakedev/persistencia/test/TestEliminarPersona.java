package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminarPersona {

	public static void main(String[] args) {
		try {
			AdminPersonas.eliminar("1716231312");
		} catch (Exception e) {
			System.out.println("Error en el sistema, no se eliminó la persona: " + e.getMessage());
		}
	}

}
