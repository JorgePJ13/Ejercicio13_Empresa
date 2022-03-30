package main;

import java.util.ArrayList;
import java.util.List;

import entidad.Directivo;
import entidad.Empleado;
import entidad.Jefe;
import entidad.Trabajador;

public class MainEmpresa {

	public static void main(String[] args) {
		Empleado e;
		
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		Trabajador t = new Trabajador();
		t.setNombre("Jorge Pando");
		t.setSueldoBase(1500.50);
		t.setValoracion(10);
		listaEmpleados.add(t);
		
		t = new Trabajador();
		t.setNombre("Willyrex");
		t.setSueldoBase(1750.0);
		t.setValoracion(5);
		listaEmpleados.add(t);
		
		t = new Trabajador();
		t.setNombre("sTaXx");
		t.setSueldoBase(1300.75);
		t.setValoracion(8);
		listaEmpleados.add(t); // 3 empleados de momento
		
		Jefe j = new Jefe();
		j.setNombre("Ibai Llanos");
		j.setSueldoBase(2000.0);
		j.setIncentivo(500);
		listaEmpleados.add(j);
		
		j = new Jefe();
		j.setNombre("Auronplay");
		j.setSueldoBase(2520.50);
		j.setIncentivo(250);
		listaEmpleados.add(j); // de momento 5 empleados a cargo del directivo
		
		Directivo d = new Directivo();
		d.setNombre("illoJuan");
		d.setSueldoBase(3500.25);
		d.setListaEmpleados(listaEmpleados);
		
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado.toString());
			empleado.calcularSueldoFinal();
			System.out.println();
		}

		d.calcularSueldoFinal();
	}
}
