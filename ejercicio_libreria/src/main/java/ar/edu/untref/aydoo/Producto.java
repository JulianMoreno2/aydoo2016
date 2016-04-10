package ar.edu.untref.aydoo;

public class Producto {

	private int precio;
	private String nombre;

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;		
	}
	
	public String getNombre(){
		return this.nombre;
	}
}
