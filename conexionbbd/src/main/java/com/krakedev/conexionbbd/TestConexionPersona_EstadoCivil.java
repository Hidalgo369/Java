package com.krakedev.conexionbbd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestConexionPersona_EstadoCivil {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ConectionJava", "postgres",
					"Dsoftware10@");
			System.out.println("Conexión exitosa");
			ps = connection.prepareStatement(
					"insert into persona (cedula, nombre, apellido, estado_civil_codigo, numero_hijos, estatura, cantidad_ahorrada, fecha_nacimiento, hora_nacimiento)"
							+ "values(?,?,?,?,?,?,?,?,?)");

			ps.setString(1, "1713616123");
			ps.setString(2, "Rosalia");
			ps.setString(3, "Romero");
			ps.setString(4, "U");
			ps.setInt(5, 2);
			ps.setDouble(6, 1.56);
			ps.setBigDecimal(7, new BigDecimal(1200.45));

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:sss");
			String fechaStr = "2006/10/04 10:05:04";

			try {
				java.util.Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);

				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);

				ps.setDate(8, fechaSQL);
				ps.setTime(9, timeSQL);

				ps.executeUpdate();
				System.out.println("Ejecuta insert");

			} catch (ParseException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
