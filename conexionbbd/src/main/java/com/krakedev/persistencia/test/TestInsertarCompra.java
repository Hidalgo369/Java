package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Clientes;
import com.krakedev.persistencia.entidades.Compras;
import com.krakedev.persistencia.servicios.AdminCompras;
import com.krakedev.persistencia.utils.Convertidor;

public class TestInsertarCompra {

	public static void main(String[] args) {
		Clientes c = new Clientes("6749278103", "Bill", "Gates");
		Compras cr = new Compras();
		cr.setIdCompra(11);
		cr.setCedula(c);
		
		try {
			Date fechaCom = Convertidor.convertirFecha("2024/10/06");
			cr.setMonto(new BigDecimal(1234567.89));
			cr.setFechaCompra(fechaCom);
			AdminCompras.insertar(cr);

		} catch (Exception e) {
			System.out.println("Error en el sistema, no se registró la compra: " + e.getMessage());
		}
	}

}