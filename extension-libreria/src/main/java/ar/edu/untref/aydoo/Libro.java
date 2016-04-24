package ar.edu.untref.aydoo;

public class Libro extends Producto implements Suscribible{
	
	private int periodicidad;
	
	//por ahora solo constructor:
	public Libro(String nombre, Double precio) {
		super(nombre, precio);
		super.setPermisoDeSuscripcion();
	}
	public int getPeriodicidad() {
		return this.periodicidad;
	}
	
	public void setPeriodicidad(int periodicidad) {
		if (periodicidad > 0){
			this.periodicidad = periodicidad;
		}
	}
}
