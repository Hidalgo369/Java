package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizarPersona {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("S", "SOLTERO");
		Persona p = new Persona("1716231379", "Elon", "Musk", ec);

		try {
			Date fechaNac = Convertidor.convertirFecha("1971/06/28");
			Date horaNac = Convertidor.convertirHora("07:30");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(264000000000.00));
			p.setNumero_hijos(3);
			p.setEstatura(1.88);
			AdminPersonas.actualizar(p);

		} catch (Exception e) {
			System.out.println("Error en el sistema, no se actualizaron los datos: " + e.getMessage());
		}
	}

}
