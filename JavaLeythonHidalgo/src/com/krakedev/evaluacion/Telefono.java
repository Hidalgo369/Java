package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;

	public String getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}

	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		String validacionEstado = "Error";
		if (numero != null && tipo != null) {
			if (tipo.equalsIgnoreCase("Movil") || tipo.equalsIgnoreCase("Convencional")) {
				if (numero.length() == 7 || numero.length() == 10) {
					validacionEstado = "Correcto";
				}
			}
		}
		if (validacionEstado.equals("Correcto")) {
			this.estado = "C";
		} else {
			this.estado = "E";
		}
	}

}
