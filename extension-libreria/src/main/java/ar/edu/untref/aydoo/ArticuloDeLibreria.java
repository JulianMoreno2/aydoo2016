package ar.edu.untref.aydoo;

public class ArticuloDeLibreria extends Producto {

	private double montoIva = 0.0;

	public ArticuloDeLibreria(String nombre, double precio) {
		super(nombre, precio);
		this.setMontoIva();
	}

	public double getPrecio() {
		double valor =  this.getMontoIva() + super.getPrecio();
		return valor;
	}

	private void setMontoIva() {
		this.montoIva =  0.21 * super.getPrecio();
	}

	public double getMontoIva() {
		return this.montoIva;
	}

}
