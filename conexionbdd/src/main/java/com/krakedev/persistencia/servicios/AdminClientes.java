package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Clientes;
import com.krakedev.persistencia.utils.URLConexion;

public class AdminClientes {
	private static final Logger LOGGER = LogManager.getLogger(AdminClientes.class);

	public static Clientes consultar(String cedula) throws Exception {
		Connection con = null;
		PreparedStatement c;
		ResultSet rs = null;

		LOGGER.trace("Cedula de cliente al que se desea consultar >>> " + cedula);

		try {
			con = URLConexion.conectar("jdbc:postgresql://localhost:5432/postgres");
			c = con.prepareStatement("select * from clientes " + "where cedula = ?");

			c.setString(1, cedula);

			rs = c.executeQuery();

			if (rs.next()) {
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				return new Clientes(cedula, nombre, apellido);
			} else {
				throw new Exception("No se encontró al cliente con la cédula: " + cedula);
			}

		} catch (Exception e) {
			LOGGER.error("Error al consultar", e);
			throw new Exception("Error al consultar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void insertar(Clientes cliente) throws Exception {
		Connection con = null;
		PreparedStatement c;
		LOGGER.trace("Cliente a insertar>>> " + cliente);

		try {
			con = URLConexion.conectar("jdbc:postgresql://localhost:5432/postgres");
			c = con.prepareStatement("insert into clientes (cedula, nombre, apellido)" + "values(?,?,?)");

			c.setString(1, cliente.getCedula());
			c.setString(2, cliente.getNombre());
			c.setString(3, cliente.getApellido());

			c.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void actualizar(Clientes cliente) throws Exception {
		Connection con = null;
		PreparedStatement c;
		LOGGER.trace("cliente ha actualizar datos >>> " + cliente);

		try {
			con = URLConexion.conectar("jdbc:postgresql://localhost:5432/postgres");
			c = con.prepareStatement("update clientes set nombre = ?, apellido = ? where cedula = ?");

			c.setString(1, cliente.getNombre());
			c.setString(2, cliente.getApellido());
			c.setString(3, cliente.getCedula());
			c.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void eliminar(String cedula) throws Exception {
		Connection con = null;
		PreparedStatement c;
		LOGGER.trace("Cedula de cliente al que se desea eliminar información >>> " + cedula);

		try {
			con = URLConexion.conectar("jdbc:postgresql://localhost:5432/postgres");
			c = con.prepareStatement("delete from clientes where cedula = ?");

			c.setString(1, cedula);

			c.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al eliminar", e);
			throw new Exception("Error al eliminar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

}
