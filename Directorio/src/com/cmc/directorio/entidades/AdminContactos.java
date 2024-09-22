package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto contac1, Contacto contac2) {
		if (contac1.getPeso() > contac2.getPeso()) {
			return contac1;
		} else if (contac1.getPeso() < contac2.getPeso()) {
			return contac2;
		} else {
			return null;
		}
	}

	public boolean compararOperadoras(Contacto contac1, Contacto contac2) {
		if (contac1.getTelefono().getOperadora() == contac2.getTelefono().getOperadora()) {
			return true;
		} else {
			return false;
		}
	}

	public void activarUsuario(Contacto contac1) {
		if (contac1.getTelefono().isTieneWhatsapp() == true) {
			contac1.setActivo(true);
		}
	}
}
