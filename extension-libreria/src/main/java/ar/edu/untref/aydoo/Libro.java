package ar.edu.untref.aydoo;

public class Libro extends Producto{
	
	public Alquiler alquiler;
	
	public Libro(String nombre, double precio) {
		super(nombre, precio);
		this.alquiler = new Alquiler(0);
		this.alquiler.setPrecio(precio);
	}
	
	public void setAlquiler(Alquiler alquiler){
		this.alquiler = alquiler;
	}
	
	public Alquiler getAlquiler(){
		return this.alquiler;
	}
	
	public double getPrecio(){
		return this.alquiler.getPrecio();
	}
}
