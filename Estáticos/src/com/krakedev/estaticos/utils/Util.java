package com.krakedev.estaticos.utils;

public class Util {
	public static String formatearHora(int hora) {
		if (hora >= 0 && hora <= 9) {
			return "0" + hora;
		} else
			return hora + "";
	}

	public static String formatearDia(int dia) {
		if (dia == 0) {
			return "Lunes";
		} else if (dia == 1) {
			return "Martes";
		} else if (dia == 2) {
			return "Miércoles";
		} else if (dia == 3) {
			return "Jueves";
		} else if (dia == 4) {
			return "Viernes";
		} else if (dia == 5) {
			return "Sábado";
		} else if (dia == 6) {
			return "Domingo";
		} else {
			return "Error";
		}
	}

}
