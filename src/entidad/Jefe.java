package entidad;

public class Jefe extends Empleado {

	private int incentivo;

	public int getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(int incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return "Jefe [incentivo=" + incentivo + "]";
	}

	@Override
	public void calcularSueldoFinal() {
		double sueldo;
		sueldo = sueldoBase + incentivo;
		System.out.println("El sueldo final del jefe " + this.nombre + " es: " + sueldo);
	}

}
