package ar.edu.untref.aydoo;

public class Producto {

	private String nombre;
	private Double precio;
	private boolean permiteSuscripcion;

	public Producto(String nombre, Double precio){
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.permiteSuscripcion = false;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String string) {
		this.nombre = string;
	}

	public Double getPrecio() {
		return this.precio;
	}
	/**
	 * modify by Rain
	 */
	public void setPrecio(Double precio){
		if (precio > 0) {
			this.precio = precio;
		}
	}

	public boolean permiteLaSuscripcion() {
		return permiteSuscripcion;
	}
	
	public void setPermisoDeSuscripcion(){
		this.permiteSuscripcion = true;
	}
}
