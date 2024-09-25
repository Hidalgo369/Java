package krakedev.entidades;

public class Nota {
	private Materia materia;
	private double calificacion;

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public void mostrar() {
		if (materia != null) {
			System.out.println("Nota[Materia[Codigo=" + materia.getCodigo() + ", Nombre=" + materia.getNombre()
					+ "], Calificación=" + calificacion + "]");
		}
	}

	public Nota(Materia materia, double calificacion) {
		this.materia = materia;
		this.calificacion = calificacion;
	}

}
