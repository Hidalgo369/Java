package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public void agregarNota(Nota nuevaNota) {
		if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
			boolean existeNota = false;
			if (notas != null) {
				for (int i = 0; i < notas.size(); i++) {
					if (notas.get(i).getMateria() != null) {
						String elementoNota = notas.get(i).getMateria().getCodigo();
						String codigoNuevaNota = nuevaNota.getMateria().getCodigo();
						if (elementoNota.equals(codigoNuevaNota)) {
							existeNota = true;
							System.out.println("La nota ya existe");
							break;
						}
					}
				}
				if (!existeNota) {
					notas.add(nuevaNota);
					System.out.println("Nota agregada exitosamente");
				}
			}
		} else {
			System.out.println("Solo se aceptan calificaciones entre 0 y 10 (incluidos)");
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		if (notas != null) {
			for (int i = 0; i < notas.size(); i++) {
				if (notas.get(i).getMateria() != null) {
					String elementoCodigoNota = notas.get(i).getMateria().getCodigo();
					if (elementoCodigoNota.equals(codigo)) {
						if (nuevaNota >= 0 && nuevaNota <= 10) {
							notas.get(i).setCalificacion(nuevaNota);
							System.out.println("Se modificó la calificación");
						} else {
							System.out.println("Solo se aceptan calificaciones entre 0 y 10 (incluidos)");
						}
						break;
					}
				}
			}
		}
	}

	public double calcularPromedioNotasEstudiante() {
		if (notas != null) {
			double sumaCalificaciones = 0;
			int cantidadCalificaciones = 0;
			for (int i = 0; i < notas.size(); i++) {
				sumaCalificaciones += notas.get(i).getCalificacion();
				cantidadCalificaciones++;
			}
			if (cantidadCalificaciones > 0) {
				double promedio = sumaCalificaciones / cantidadCalificaciones;
				return promedio;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}

	public void mostrar() {
		if (notas != null) {
			System.out.println("Estudiante[Nombre=" + nombre + ", Apellido=" + apellido + ", Cedula=" + cedula + "]");

			for (int i = 0; i < notas.size(); i++) {
				if (notas.get(i) != null) {
					Materia materia = notas.get(i).getMateria();
					System.out.println("	Notas[Materia[Codigo=" + materia.getCodigo() + ", Nombre="
							+ materia.getNombre() + "]" + ", Calificación=" + notas.get(i).getCalificacion() + "]");
				}
			}
		} else {
			System.out.println("Estudiante[Nombre=" + nombre + ", Apellido=" + apellido + ", Cedula=" + cedula
					+ ", No se encontró notas");
		}
	}

	public Estudiante(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.notas = new ArrayList<>();
	}

}