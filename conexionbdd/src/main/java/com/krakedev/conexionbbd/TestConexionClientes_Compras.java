package com.krakedev.conexionbbd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestConexionClientes_Compras {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		PreparedStatement psr = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"Dsoftware10@");
			System.out.println("Conexión exitosa");
			ps = connection.prepareStatement("insert into clientes (cedula, nombre, apellido)" + "values(?,?,?)");
			psr = connection.prepareStatement(
					"insert into compras (id_compra, cedula, fecha_compra, monto)" + "values(?,?,?,?)");

			ps.setString(1, "0123456789");
			ps.setString(2, "Cristiano");
			ps.setString(3, "Ronaldo");
			ps.executeUpdate();

			psr.setInt(1, 100);
			psr.setString(2, "0123456789");
			psr.setBigDecimal(4, new BigDecimal("7000000.00"));

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr = "2024/10/04";
			try {
				java.util.Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);

				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);

				psr.setDate(3, fechaSQL);
				psr.executeUpdate();
				System.out.println("Ejecuta insert");

			} catch (ParseException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}