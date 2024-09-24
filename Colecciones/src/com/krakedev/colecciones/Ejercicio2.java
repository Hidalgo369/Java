package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();

		personas.add(new Persona("Leo", "Messi"));
		personas.add(new Persona("Cristiano", "Ronaldo"));
		personas.add(new Persona("Neymar", "da Silva"));

		Persona elementoPersona;
		for (int i = 0; i < personas.size(); i++) {
			elementoPersona = personas.get(i);
			System.out.println(elementoPersona.getNombre() + " - " + elementoPersona.getApellido());
		}
	}

}
