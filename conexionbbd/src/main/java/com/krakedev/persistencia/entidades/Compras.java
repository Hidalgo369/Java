package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Compras {
	private int idCompra;
	private Clientes cliente;
	private Date fechaCompra;
	private BigDecimal monto;

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public Clientes getCedula() {
		return cliente;
	}

	public void setCedula(Clientes cedula) {
		this.cliente = cedula;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public BigDecimal  getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal  monto) {
		this.monto = monto;
	}

	public Compras() {
		super();
	}

	public Compras(int idCompra, Clientes cliente, Date fechaCompra, BigDecimal monto) {
		super();
		this.idCompra = idCompra;
		this.cliente = cliente;
		this.fechaCompra = fechaCompra;
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Compras [idCompra=" + idCompra + ", cedula=" + cliente + ", fechaCompra=" + fechaCompra + ", monto="
				+ monto + "]";
	}

}
