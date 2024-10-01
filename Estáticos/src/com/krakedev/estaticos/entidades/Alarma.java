package com.krakedev.estaticos.entidades;

import com.krakedev.estaticos.utils.Util;

public class Alarma {
	private int día;
	private int hora;
	private int minuto;

	public int getDía() {
		return día;
	}

	public void setDía(int día) {
		this.día = día;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public Alarma(int día, int hora, int minuto) {
		this.día = día;
		this.hora = hora;
		this.minuto = minuto;
	}

	@Override
	public String toString() {
		String formatoDía = Util.formatearDia(día);
		String formatoHora = Util.formatearHora(hora);
		String formatoMinuto = Util.formatearHora(minuto);
		return "Alarma [día=" + formatoDía + ", hora=" + formatoHora + ", minuto=" + formatoMinuto + "]";
	}

}