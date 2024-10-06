package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Persona {
	private String cedula;
	private String nombre;
	private String apellido;

	private EstadoCivil estadoCivil; // atributo relación tablas

	private int numero_hijos;
	private double estatura;
	private BigDecimal cantidadAhorrada;
	private Date fechaNacimiento;
	private Date horaNacimiento;

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

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getNumero_hijos() {
		return numero_hijos;
	}

	public void setNumero_hijos(int numero_hijos) {
		this.numero_hijos = numero_hijos;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public BigDecimal getCantidadAhorrada() {
		return cantidadAhorrada;
	}

	public void setCantidadAhorrada(BigDecimal cantidadAhorrada) {
		this.cantidadAhorrada = cantidadAhorrada;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getHoraNacimiento() {
		return horaNacimiento;
	}

	public void setHoraNacimiento(Date horaNacimiento) {
		this.horaNacimiento = horaNacimiento;
	}

	public Persona() {
		super();
	}

	public Persona(String cedula, String nombre, String apellido, EstadoCivil estadoCivil, int numero_hijos,
			double estatura, BigDecimal cantidadAhorrada, Date fechaNacimiento, Date horaNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
		this.numero_hijos = numero_hijos;
		this.estatura = estatura;
		this.cantidadAhorrada = cantidadAhorrada;
		this.fechaNacimiento = fechaNacimiento;
		this.horaNacimiento = horaNacimiento;
	}

	public Persona(String cedula, String nombre, String apellido, EstadoCivil estadoCivil) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil="
				+ estadoCivil + ", numero_hijos=" + numero_hijos + ", estatura=" + estatura + ", cantidadAhorrada="
				+ cantidadAhorrada + ", fechaNacimiento=" + fechaNacimiento + ", horaNacimiento=" + horaNacimiento
				+ "]";
	}
}
