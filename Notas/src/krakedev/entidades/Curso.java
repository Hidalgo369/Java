package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Curso() {
		this.estudiantes = new ArrayList<>();
	}

	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		if (estudiantes != null) {
			for (int i = 0; i < estudiantes.size(); i++) {
				if (estudiante.getCedula().equals(estudiantes.get(i).getCedula())) {
					return "El estudiante ya se encuentra registrado en un curso";
				}
			}
			return null;

		} else {
			return "No se encontró registros de estudiantes";
		}
	}

	public void matricularEstudiante(Estudiante estudiante) {
		String buscandoEstudiante = buscarEstudiantePorCedula(estudiante);
		if (buscandoEstudiante == null) {
			if (estudiantes == null) {
				estudiantes = new ArrayList<>();
			}
			estudiantes.add(estudiante);
		} else {
			System.out.println(buscandoEstudiante);
		}
	}

	public double calcularPromedioCurso() {
		double promedioCurso = 0;
		if (estudiantes != null) {
			double calificaciones = 0;
			int cantidadNotas = 0;
			for (int i = 0; i < estudiantes.size(); i++) {
				Estudiante estudiante = estudiantes.get(i);
				if (estudiante.getNotas() != null) {
					for (int j = 0; j < estudiante.getNotas().size(); j++) {
						Nota nota = estudiante.getNotas().get(j);
						if (nota != null) {
							calificaciones += nota.getCalificacion();
							cantidadNotas++;
						}
					}
				}
			}
			if (cantidadNotas > 0) {
				promedioCurso = calificaciones / cantidadNotas;
			}
		}
		return promedioCurso;
	}

	public void mostrar() {
		if (estudiantes != null) {
			System.out.println("Curso");
			for (int i = 0; i < estudiantes.size(); i++) {
				Estudiante estudiante = estudiantes.get(i);
				if (estudiante != null) {
					System.out.println("    [Estudiante[Nombre=" + estudiante.getNombre() + ", Apellido="
							+ estudiante.getApellido() + ", Cedula=" + estudiante.getCedula() + "]");

					if (estudiante.getNotas() != null && !estudiante.getNotas().isEmpty()) {
						System.out.print("        [Notas=[");
						for (int j = 0; j < estudiante.getNotas().size(); j++) {
							Nota nota = estudiante.getNotas().get(j);
							if (nota != null) {
								Materia materia = nota.getMateria();
								System.out.print("Materia[Codigo=" + materia.getCodigo() + ", Nombre="
										+ materia.getNombre() + ", Calificación=" + nota.getCalificacion() + "]");
								if (j < estudiante.getNotas().size() - 1) {
									System.out.print(", ");
								}
							}
						}
						System.out.println("]]");
					} else {
						System.out.println("        [Notas=[No hay notas disponibles]]");
					}
					System.out.println(" ");
				}
			}
		} else {
			System.out.println("No se encontraron estudiantes.");
		}
	}

}