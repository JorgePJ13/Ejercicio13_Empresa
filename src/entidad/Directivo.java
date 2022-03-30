package entidad;

import java.util.List;

public class Directivo extends Empleado {

	private List<Empleado> listaEmpleados;

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	@Override
	public String toString() {
		return "Directivo [listaEmpleados=" + listaEmpleados + "]";
	}

	@Override
	public void calcularSueldoFinal() {
		double sueldo;
		sueldo = sueldoBase + listaEmpleados.size() * 100;
		System.out.println("El sueldo final del directivo " + this.nombre + " es: " + sueldo);
	}

}
