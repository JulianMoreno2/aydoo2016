package ar.edu.untref.aydoo;

public class Periodico extends Producto {
	
	private Periodicidad periodicidad;

	public Periodico(String nombre, int precio, Periodicidad periodicidad) {
		super.setNombre(nombre);
		super.setPrecio(precio);
		this.periodicidad = periodicidad;
	}
	
	public Periodicidad getPeriodicidad(){
		return this.periodicidad;
	}
}
