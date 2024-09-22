package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminContactos;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono telf7 = new Telefono("movi", "09864382984", 110);
		Telefono telf10 = new Telefono("claro", "09994382955", 120);
		
		Contacto info1 = new Contacto("Ronaldo", telf7, 83);
		Contacto info2 = new Contacto("Messi", telf10, 67);
		
		AdminContactos referencia = new AdminContactos();
		
		Contacto masPesado = referencia.buscarMasPesado(info1, info2);
		System.out.println("El más pesado es: " + masPesado.getApellido() + " con " + masPesado.getPeso() + " kg");
		
		boolean comparacionOperadora = referencia.compararOperadoras(info1, info2);
		if(comparacionOperadora == true) {
			System.out.println(info1.getApellido() + " y " + info2.getApellido() + " tienen la misma operadora");
		} else {
			System.out.println(info1.getApellido() + " y " + info2.getApellido() + " tienen operadora diferentes");
		}

	}

}
