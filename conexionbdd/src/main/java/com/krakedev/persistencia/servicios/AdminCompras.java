package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Clientes;
import com.krakedev.persistencia.entidades.Compras;
import com.krakedev.persistencia.utils.URLConexion;

public class AdminCompras {
	private static final Logger LOGGER = LogManager.getLogger(AdminCompras.class);

	public static Compras consultar(String id_compra) throws Exception {
		Connection con = null;
		PreparedStatement cp;
		ResultSet rs = null;

		LOGGER.trace("Id de compta del cliente al que se desea consultar >>> " + id_compra);

		try {
			con = URLConexion.conectar("jdbc:postgresql://localhost:5432/postgres");
			cp = con.prepareStatement("select c.id_compra, c.fecha_compra, c.monto, cl.cedula, cl.nombre, cl.apellido "
					+ "from compras c, clientes cl " + "where (c.cedula = cl.cedula) and (c.id_compra = ?)");

			cp.setInt(1, Integer.parseInt(id_compra));

			rs = cp.executeQuery();

			if (rs.next()) {
				int idCompra = rs.getInt("id_compra");
				String cedulaCliente = rs.getString("cedula");
				String nombreCliente = rs.getString("nombre");
				String apellidoCliente = rs.getString("apellido");
				Clientes cliente = new Clientes(cedulaCliente, nombreCliente, apellidoCliente);
				Date fechaCompra = rs.getDate("fecha_compra");
				BigDecimal monto = rs.getBigDecimal("monto");

				return new Compras(idCompra, cliente, fechaCompra, monto);
			} else {
				throw new Exception("No se encontró la compra con id: " + id_compra);
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

	public static void insertar(Compras compra) throws Exception {
		Connection con = null;
		PreparedStatement cp;
		LOGGER.trace("compras a insertar>>> " + compra);

		try {
			con = URLConexion.conectar("jdbc:postgresql://localhost:5432/postgres");
			cp = con.prepareStatement(
					"insert into compras (id_compra, cedula, fecha_compra, monto)" + "values(?,?,?,?)");

			cp.setInt(1, compra.getIdCompra());
			cp.setString(2, compra.getCedula().getCedula());
			cp.setDate(3, new java.sql.Date(compra.getFechaCompra().getTime()));
			cp.setBigDecimal(4, compra.getMonto());

			cp.executeUpdate();

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

	public static void actualizar(Compras compra) throws Exception {
		Connection con = null;
		PreparedStatement cp;
		LOGGER.trace("compras ha actualizar datos >>> " + compra);

		try {
			con = URLConexion.conectar("jdbc:postgresql://localhost:5432/postgres");
			cp = con.prepareStatement("update compras set cedula = ?, fecha_compra = ?, monto = ? where id_compra = ?");

			cp.setString(1, compra.getCedula().getCedula());
			cp.setDate(2, new java.sql.Date(compra.getFechaCompra().getTime()));
			cp.setBigDecimal(3, compra.getMonto());
			cp.setInt(4, compra.getIdCompra());

			cp.executeUpdate();

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

	public static void eliminar(int id_compra) throws Exception {
		Connection con = null;
		PreparedStatement cp;
		LOGGER.trace("Cedula de compras al que se desea eliminar información >>> " + id_compra);

		try {
			con = URLConexion.conectar("jdbc:postgresql://localhost:5432/postgres");
			cp = con.prepareStatement("delete from compras where id_compra = ?");

			cp.setInt(1, id_compra);

			cp.executeUpdate();

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
