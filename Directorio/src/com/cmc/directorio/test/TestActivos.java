package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf11 = new Telefono("claro", "09861384972", 140);
		Contacto contactoNuevo = new Contacto("Tesla", telf11, 58);
		
		System.out.println("Codigo: " + contactoNuevo.getTelefono().getCodigo());
		System.out.println("Numero: " + contactoNuevo.getTelefono().getNumero());
		System.out.println("Operadora: " + contactoNuevo.getTelefono().getOperadora());
		System.out.println("Tiene WhatsAp?: " + contactoNuevo.getTelefono().isTieneWhatsapp());
		
		AdminContactos activar = new AdminContactos();
		activar.activarUsuario(contactoNuevo);
		
		System.out.println(" ");
		System.out.println("Codigo: " + contactoNuevo.getTelefono().getCodigo());
		System.out.println("Numero: " + contactoNuevo.getTelefono().getNumero());
		System.out.println("Operadora: " + contactoNuevo.getTelefono().getOperadora());
		System.out.println("Está activo?: " + contactoNuevo.isActivo());
	}

}
