package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U", "UNION LIBRE");
		Persona p = new Persona("1716231379", "Julio", "Jaramillo", ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("2000/12/23");
			Date horaNac = Convertidor.convertirHora("12:23");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(1230.45));
			p.setNumero_hijos(50);
			AdminPersonas.insertar(p);

		} catch (Exception e) {
			System.out.println("Error en el sistema, no se registró la persona: " + e.getMessage());
		}
	}

}
