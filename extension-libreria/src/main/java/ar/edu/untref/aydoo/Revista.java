package ar.edu.untref.aydoo;

public class Revista extends Producto implements Suscribible{

	private int periodicidad;

	public Revista(String nombre, Double precio){
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
