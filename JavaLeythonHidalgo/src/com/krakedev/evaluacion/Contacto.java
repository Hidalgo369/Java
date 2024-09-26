package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private String tipo;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		telefonos = new ArrayList<>();
	}

	public void imprimir() {
		System.out.println("Cédula: " + cedula);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		if (direccion != null) {
			System.out.println("Dirección:");
			System.out.println("  Calle Principal: " + direccion.getCallePrincipal());
			System.out.println("  Calle Secundaria: " + direccion.getCalleSecundaria());
		}
	}

	public void imprimir2() {
		System.out.println("****" + nombre + "****");
		if (direccion != null) {
			System.out.println("Dirección: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
		} else {
			System.out.println("No tiene asociada una dirección");
		}
	}

	public void agregarTelefono(Telefono telefono) {
		if (telefono != null) {
			telefonos.add(telefono);
		}
	}

	public void mostrarTelefonos() {
		if (telefonos != null) {
			System.out.println("Teléfonos con estado: 'C'");
			for (int i = 0; i < telefonos.size(); i++) {
				Telefono elementoTelefono = telefonos.get(i);
				if (elementoTelefono.getEstado().equals("C")) {
					System.out.println(
							"Número: " + elementoTelefono.getNumero() + ", Tipo:" + elementoTelefono.getTipo());
				}
			}
		}
	}

	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> incorrectos = new ArrayList<>();
		if (telefonos != null) {
			for (int i = 0; i < telefonos.size(); i++) {
				String estadoTelefono = telefonos.get(i).getEstado();
				if (estadoTelefono.equals("E"))
					incorrectos.add(telefonos.get(i));
			}
		}
		return incorrectos;
	}
}
