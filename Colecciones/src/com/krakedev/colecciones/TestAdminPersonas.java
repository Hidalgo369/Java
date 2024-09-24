package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("Mario", "Benedetti", 50));
		admin.agregar(new Persona("Clark", "Kent", 30));
		admin.agregar(new Persona("Bruno", "Díaz", 25));
		admin.imprimir();

		Persona p1 = admin.buscarPorNombre("Bruno");
		if (p1 != null) {
			System.out.println("Encontrado: " + p1.getApellido() + " " + p1.getEdad());
		} else {
			System.out.println("No existe la persona");
		}

		ArrayList<Persona> personasMayores = admin.buscarMayores(10);

		System.out.println("Mayores: " + personasMayores.size());

	}

}
