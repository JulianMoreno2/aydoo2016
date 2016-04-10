package ar.edu.untref.aydoo;

public class Revista extends Producto {
	
	private Periodicidad periodicidad;

	public Revista(String nombre, int precio, Periodicidad periodicidad) {
		super.setNombre(nombre);
		super.setPrecio(precio);
		this.periodicidad = periodicidad;
	}

	public Periodicidad getPeriodicidad() {
		return periodicidad;
	}
}
