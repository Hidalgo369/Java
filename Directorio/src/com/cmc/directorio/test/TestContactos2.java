package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telf8 = new Telefono("movi", "094643829812", 130);
		Telefono telf9 = new Telefono("claro", "09604382467", 140);

		Contacto info3 = new Contacto("Goku", telf8, 62);
		Contacto info4 = new Contacto("Vegeta", telf9, 56);

		AdminContactos referencia = new AdminContactos();

		Contacto masPesado = referencia.buscarMasPesado(info3, info4);
		System.out.println("El más pesado es: " + masPesado.getApellido() + " con " + masPesado.getPeso() + " kg");

		boolean comparacionOperadora = referencia.compararOperadoras(info3, info4);
		if (comparacionOperadora == true) {
			System.out.println(info3.getApellido() + " y " + info4.getApellido() + " tienen la misma operadora");
		} else {
			System.out.println(info3.getApellido() + " y " + info4.getApellido() + " tienen operadora diferentes");
		}	
	}
	
}
