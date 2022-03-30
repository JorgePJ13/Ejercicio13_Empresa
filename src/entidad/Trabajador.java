package entidad;

public class Trabajador extends Empleado {

	private int valoracion;

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	@Override
	public String toString() {
		return "Trabajador [valoracion=" + valoracion + "]";
	}

	@Override
	public void calcularSueldoFinal() {
		double sueldo = 0;
		if (valoracion >= 0 && valoracion <= 4) {
			sueldo = sueldoBase + 0;
		} else if (valoracion >= 5 && valoracion <= 6) {
			sueldo = sueldoBase + 50.0;
		} else if (valoracion >= 7 && valoracion <= 8) {
			sueldo = sueldoBase + 100.0;
		} else if (valoracion >= 9 && valoracion <= 10) {
			sueldo = sueldoBase + 200.0;
		}
		System.out.println("El sueldo final del trabajador " + this.nombre + " es: " + sueldo);
	}

}
