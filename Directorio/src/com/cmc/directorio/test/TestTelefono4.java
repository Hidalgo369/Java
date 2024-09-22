package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf4 = new Telefono("movi", "09743529623", 60);
		Telefono telf5 = new Telefono("claro", "09473838292", 70);
		Telefono telf6 = new Telefono("claro", "09624561925", 80);
		Telefono telf7 = new Telefono("claro", "09456332090", 90);

		AdminTelefono invocar = new AdminTelefono();
		int contadorClaro = invocar.contarClaro(telf4, telf5, telf6, telf7);
		System.out.println(contadorClaro + " son operadora Claro");

	}

}
