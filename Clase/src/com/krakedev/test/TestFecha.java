package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		/*Fecha fecha1 = new Fecha();
		fecha1.setAnio(2000);
		fecha1.setMes(12);
		fecha1.setDia(12);
		System.out.println(fecha1.getAnio());*/
		
		Fecha fecha1 = new Fecha(12,12,2024);
		System.out.println("Día: " + fecha1.getDia());
		System.out.println("Mes: " + fecha1.getMes());
		System.out.println("Año: " + fecha1.getAnio());
	}

}
