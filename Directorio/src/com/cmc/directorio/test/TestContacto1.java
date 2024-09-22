package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi", "09834621311", 100);
		Contacto c = new Contacto("Carapaz", telef, 70.6);

		System.out.println(c.getApellido());
		System.out.println(c.getPeso());
		System.out.println(telef.getOperadora());
		System.out.println(telef.getNumero());
		System.out.println(telef.getCodigo());
	}

}
