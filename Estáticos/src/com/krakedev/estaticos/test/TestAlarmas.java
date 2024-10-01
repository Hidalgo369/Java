package com.krakedev.estaticos.test;

import java.util.ArrayList;

import com.krakedev.estaticos.entidades.Alarma;
import com.krakedev.estaticos.logica.AdminAlarmas;
import com.krakedev.estaticos.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		AdminAlarmas admin = new AdminAlarmas();
		
		Alarma alarma1 = new Alarma(DiasSemana.LUNES, 8, 10);
		Alarma alarma2 = new Alarma(DiasSemana.MARTES, 9, 15);
		Alarma alarma3 = new Alarma(DiasSemana.MIERCOLES, 10, 20);
		Alarma alarma4 = new Alarma(DiasSemana.JUEVES, 11, 25);
		Alarma alarma5 = new Alarma(DiasSemana.VIERNES, 12, 30);
		Alarma alarma6 = new Alarma(DiasSemana.SABADO, 13, 35);
		Alarma alarma7 = new Alarma(DiasSemana.DOMINGO, 14, 40);

		admin.agregarAlarma(alarma1);
		admin.agregarAlarma(alarma2);
		admin.agregarAlarma(alarma3);
		admin.agregarAlarma(alarma4);
		admin.agregarAlarma(alarma5);
		admin.agregarAlarma(alarma6);
		admin.agregarAlarma(alarma7);
		
		ArrayList<Alarma> alarmasActuales = admin.getAlarmas();
		System.out.println(alarmasActuales);
	}

}
