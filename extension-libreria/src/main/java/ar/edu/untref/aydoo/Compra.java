package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	private int nroMes;
	protected List<Producto> productosComprados;

	public Compra() {
		this.productosComprados = new ArrayList<Producto>();
	}

	public void setNroMes(int mes) {
		if(mes > 0){
			this.nroMes = mes;
		}else{
			throw new RuntimeException("El numero del mes no puede ser negativo");
		}
	}

	public int getNroMes() {
		return this.nroMes;
	}

	public Double getPrecio() {
		Double precioCalculado;
		precioCalculado = 0.0;
		for (Producto produ : this.productosComprados) {
			precioCalculado = produ.getPrecio() + precioCalculado;
		}
		return precioCalculado;
	}
	
	public boolean contiene(Producto unProducto) {
		return this.productosComprados.contains(unProducto);
	}

	public void agregarProducto(Producto unProducto){
		this.productosComprados.add(unProducto);
	}
}
