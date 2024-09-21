package com.cmc.respaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante("Leython");
		
		estudiante.Calificar(10.0);
		
		System.out.println("Nombre: " + estudiante.getNombre());
		System.out.println("Nota: " + estudiante.getNota());
		System.out.println("Resultado: " + estudiante.getResultado());
	}

}
