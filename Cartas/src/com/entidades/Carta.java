package com.entidades;

import java.util.ArrayList;

public class Carta {
	private Numero numero;
	private String palo;
	private String estado = "N";
	private ArrayList<Carta> auxiliar;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public ArrayList<Carta> getAuxiliar() {
		return auxiliar;
	}

	public void setAuxiliar(ArrayList<Carta> auxiliar) {
		this.auxiliar = auxiliar;
	}

	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public Carta(Numero numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}

	public void mostrarInformacion() {
		if (numero != null) {
			System.out.println(numero.getNumeroCarta() + "-" + palo);
		}
	}

}
