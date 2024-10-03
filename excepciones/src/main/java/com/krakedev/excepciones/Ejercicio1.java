package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("inicio");
		String a = "xxxss";
		try {
			System.out.println("ABRE LA CONEXIÓN BDD");
			a.substring(3);
			System.out.println("fin");
			System.out.println("CIERRA LA CONEXIÓN BDD");
		} catch (Exception ex) {
			System.out.println("entra al cacth");
		} finally {
			System.out.println("ingresa al finally");
		}
		System.out.println("fuera del catch");

	}

}
