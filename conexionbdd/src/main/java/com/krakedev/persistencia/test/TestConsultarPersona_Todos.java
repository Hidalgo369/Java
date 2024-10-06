package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultarPersona_Todos {

	public static void main(String[] args) {
		try {
			ArrayList<String> persona = AdminPersonas.consultarTodasLasPersonas();
			System.out.println(persona);
		} catch (Exception e) {
			System.out
					.println("Error en el sistema, no se encontró a la persona en la base de datos: " + e.getMessage());
		}

	}

}
