package ar.edu.untref.aydoo;

public class Periodico extends Producto implements Suscribible{

	private int periodicidad;

	public Periodico(String nombre, Double precio){
		super(nombre, precio);
		super.setPermisoDeSuscripcion();;
	}	
	
	public void setPeriodicidad(int periodicidad) {
		if (periodicidad > 0){
			this.periodicidad = periodicidad;
		}
	}

	@Override
	public int getPeriodicidad() {
		return this.periodicidad;
	}
}
