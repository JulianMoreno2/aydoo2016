package ar.edu.untref.aydoo;

import java.util.LinkedList;

public class Compra {
	
	private Mes mes;
	private LinkedList<Producto> listaDeProductos;

	public Compra(Mes mes) {
		this.mes = mes;
		this.listaDeProductos = new LinkedList<Producto>();
	}

	public void agregarProducto(Producto producto) {
		this.listaDeProductos.add(producto);		
	}

	public Mes getMes() {
		return mes;
	}

	public LinkedList<Producto> getListaDeProductos() {
		return this.listaDeProductos;
	}
}
