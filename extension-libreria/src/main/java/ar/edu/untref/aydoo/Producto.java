package ar.edu.untref.aydoo;

import javax.management.RuntimeErrorException;

public class Producto {

	private String nombre;
	private double precio;
	private boolean permiteSuscripcion;

	public Producto(String nombre, double precio){
		this.setNombre(nombre);
		if(precio > 0){
			this.setPrecio(precio);
		}else{
			throw new RuntimeException("El precio no puede ser negativo");
		}
		this.permiteSuscripcion = false;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String string) {
		this.nombre = string;
	}

	public double getPrecio() {
		return this.precio;
	}
	/**
	 * modify by Rain
	 */
	public void setPrecio(Double precio){
		if (precio > 0) {
			this.precio = precio;
		}else{
			throw new RuntimeException("El precio no puede ser negativo");
		}
	}

	public boolean permiteLaSuscripcion() {
		return permiteSuscripcion;
	}
	
	public void setPermisoDeSuscripcion(){
		this.permiteSuscripcion = true;
	}
}
