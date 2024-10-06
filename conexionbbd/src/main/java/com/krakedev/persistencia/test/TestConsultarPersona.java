package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultarPersona {

	public static void main(String[] args) {
		try {
			Persona persona = AdminPersonas.consultar("1716231379");
			System.out.println(persona.toString());
		} catch (Exception e) {
			System.out
					.println("Error en el sistema, no se encontró a la persona en la base de datos: " + e.getMessage());
		}
	}

}