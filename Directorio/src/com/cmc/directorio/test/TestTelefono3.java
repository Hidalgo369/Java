package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "09743721923", 30);
		Telefono telf2 = new Telefono("claro", "09723443295", 40);
		Telefono telf3 = new Telefono("movi", "09624561927", 50);

		AdminTelefono invocar = new AdminTelefono();
		int contadorMovi = invocar.contarMovi(telf1, telf2, telf3);
		System.out.println(contadorMovi + " son operadora Movistar");
	}

}
