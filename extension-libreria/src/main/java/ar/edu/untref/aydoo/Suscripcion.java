package ar.edu.untref.aydoo;

public class Suscripcion extends Compra {

	private Boolean anualidad;

	public Suscripcion() {
		super();
		this.anualidad = false;
	}

	public void activarAnualidad() {
		this.anualidad = true;
	}

	public boolean getAnualidad() {
		return this.anualidad;
	}

	public void agregarProducto(Producto producto){
		if(producto.permiteLaSuscripcion()){
			super.agregarProducto(producto);			
		}
	}

	private Double calcularCualEsPrecioFinal() {
		Double precioAcalcular = 0.0;
		for (Producto producto : this.productosComprados) {
			if(producto.permiteLaSuscripcion()){
				precioAcalcular = ((Suscribible) producto).getPeriodicidad() * producto.getPrecio();		
			}else{
				precioAcalcular = producto.getPrecio();
			}
		}
		return precioAcalcular;
	}
	
	public Double getPrecio() {
		Double precio = calcularCualEsPrecioFinal();
		if (!this.getAnualidad()) {
			return precio;
		} else {
			return precio * 0.8;
		}
	}
}
