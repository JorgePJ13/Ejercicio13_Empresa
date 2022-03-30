package entidad;

public abstract class Empleado {

	protected String nombre;
	protected double sueldoBase;

	public Empleado() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldoBase=" + sueldoBase + "]";
	}

	public abstract void calcularSueldoFinal();
}
