package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Directorio() {
		contactos = new ArrayList<>();

	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public boolean agregarContacto(Contacto contacto) {
		if (contactos != null && contacto != null) {
			Contacto cedulaContacto = buscarPorCedula(contacto.getCedula());
			if (cedulaContacto == null) {
				contactos.add(contacto);
				setFechaModificacion(new Date());
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto elementoEncontrado = null;
		if (contactos != null) {
			for (int i = 0; i < contactos.size(); i++) {
				Contacto elementoContacto = contactos.get(i);
				if (elementoContacto.getCedula().equals(cedula)) {
					elementoEncontrado = elementoContacto;
				}
			}
		}
		return elementoEncontrado;
	}

	public String consultarUltimaModificacion() {
		if (fechaModificacion != null) {
			SimpleDateFormat fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			return fecha.format(fechaModificacion);
		} else {
			return "No se ha modificado aún";
		}
	}

	public int contarPerdidos() {
		int contadorPerdidos = 0;
		if (contactos != null) {
			for (int i = 0; i < contactos.size(); i++) {
				if (contactos.get(i).getDireccion() == null) {
					contadorPerdidos++;
				}
			}
		}
		return contadorPerdidos;
	}

	public int contarFijos() {
		int contadorTelefonosConvencional = 0;
		if (contactos != null) {
			for (int i = 0; i < contactos.size(); i++) {
				ArrayList<Telefono> elementoTelefono = contactos.get(i).getTelefonos();
				if (elementoTelefono != null) {
					for (int j = 0; j < elementoTelefono.size(); j++) {
						String buscandoConvencional = elementoTelefono.get(j).getTipo();
						if (buscandoConvencional.equalsIgnoreCase("Convencional")) {
							contadorTelefonosConvencional++;
						}
					}
				}
			}
		}
		return contadorTelefonosConvencional;
	}

	public void depurar() {
		if (contactos != null) {
			correctos = new ArrayList<>();
			incorrectos = new ArrayList<>();
			for (int i = 0; i < contactos.size(); i++) {
				Contacto elementoContacto = contactos.get(i);
				if (elementoContacto.getDireccion() != null) {
					correctos.add(elementoContacto);
				} else {
					incorrectos.add(elementoContacto);
				}
			}
		}
	}
}
