package ar.edu.untref.aydoo;

import java.util.LinkedList;

public class Cliente {
	
	private String nombre;
	private LinkedList<Compra> listaDeCompras;

	public Cliente(String nombre) {
		this.nombre = nombre;
		this.listaDeCompras = new LinkedList<Compra>();
	}
	
	public String getNombre(){
		return this.nombre;
	}

	public void agregarCompra(Compra compra) {
		this.listaDeCompras.add(compra);		
	}
	
	public LinkedList<Compra> getListaDeCompras(){
		return this.listaDeCompras;
	}
}
