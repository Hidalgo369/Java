package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;
import com.krakedev.persistencia.utils.Convertidor;

public class AdminPersonas {

	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static Persona consultar(String cedula) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		ResultSet rs = null;

		LOGGER.trace("Cedula de persona al que se desea consultar >> " + cedula);

		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select p.cedula, p.nombre, p.apellido, p.estado_civil_codigo, ec.descripcion, "
					+ "p.numero_hijos, p.estatura, p.cantidad_ahorrada, p.fecha_nacimiento, p.hora_nacimiento "
					+ "from persona p, estado_civil ec " + "where p.estado_civil_codigo = ec.codigo and p.cedula = ?");

			ps.setString(1, cedula);

			rs = ps.executeQuery();

			if (rs.next()) {
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String estadoCivilCodigo = rs.getString("estado_civil_codigo");
				String estadoCivilDescripcion = rs.getString("descripcion");
				EstadoCivil estadoCivil = new EstadoCivil(estadoCivilCodigo, estadoCivilDescripcion);
				int numero_hijos = rs.getInt("numero_hijos");
				double estatura = rs.getDouble("estatura");
				String cantidadAhorradaStr = rs.getString("cantidad_ahorrada");
				BigDecimal cantidadAhorrada = Convertidor.convertirADecimal(cantidadAhorradaStr);
				Date fechaNacimiento = rs.getDate("fecha_nacimiento");
				Time horaNacimiento = rs.getTime("hora_nacimiento");

				return new Persona(cedula, nombre, apellido, estadoCivil, numero_hijos, estatura, cantidadAhorrada,
						fechaNacimiento, horaNacimiento);
			} else {
				throw new Exception("No se encontró la persona con la cédula: " + cedula);
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

	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar>>> " + persona);

		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into persona (cedula, nombre, apellido, estado_civil_codigo, numero_hijos, estatura, cantidad_ahorrada, fecha_nacimiento, hora_nacimiento)"
							+ "values(?,?,?,?,?,?,?,?,?)");

			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setInt(5, persona.getNumero_hijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));

			ps.executeUpdate();

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

	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona ha actualizar datos >>> " + persona);

		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"update persona set nombre = ?, apellido = ?, estado_civil_codigo = ?, numero_hijos = ?, estatura = ?, cantidad_ahorrada = ?, fecha_nacimiento = ?, hora_nacimiento = ? where cedula = ?");

			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3, persona.getEstadoCivil().getCodigo());
			ps.setInt(4, persona.getNumero_hijos());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidadAhorrada());
			ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));
			ps.setString(9, persona.getCedula());

			ps.executeUpdate();

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
		PreparedStatement ps;
		LOGGER.trace("Cedula de persona al que se desea eliminar información >>> " + cedula);

		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("delete from persona where cedula = ?");

			ps.setString(1, cedula);

			ps.executeUpdate();

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

	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement ps;
		ResultSet rs = null;

		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from persona where nombre like ?");
			ps.setString(1, "%" + nombreBusqueda + "%");

			rs = ps.executeQuery();

			while (rs.next()) {
				String nombre = rs.getString("nombre");
				String cedula = rs.getString("cedula");
				Persona p = new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				personas.add(p);
			}

		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		return personas;
	}

	public static ArrayList<String> consultarTodasLasPersonas() throws Exception {
		ArrayList<String> personas = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps;
		ResultSet rs = null;

		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from persona");
			rs = ps.executeQuery();

			while (rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
		
				String personaStr = "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]\n";
				personas.add(personaStr);
			}

		} catch (Exception e) {
			LOGGER.error("Error al consultar todas las personas", e);
			throw new Exception("Error al consultar todas las personas");
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		return personas;
	}

}