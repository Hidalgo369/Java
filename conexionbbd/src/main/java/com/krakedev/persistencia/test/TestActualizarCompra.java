package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Clientes;
import com.krakedev.persistencia.entidades.Compras;
import com.krakedev.persistencia.servicios.AdminCompras;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizarCompra {

	public static void main(String[] args) {
		Clientes c = new Clientes("6749278103", "Donald", "Trump");
		Compras cr = new Compras();
		cr.setIdCompra(11); //actualiza con el pk que es el id_compra
		cr.setCedula(c);

		try {
			Date fechaCom = Convertidor.convertirFecha("2024/10/06");
			cr.setMonto(new BigDecimal(10234567.89));
			cr.setFechaCompra(fechaCom);
			AdminCompras.actualizar(cr);

		} catch (Exception e) {
			System.out.println("Error en el sistema, no se actualizaron los datos: " + e.getMessage());
		}
	}

}
