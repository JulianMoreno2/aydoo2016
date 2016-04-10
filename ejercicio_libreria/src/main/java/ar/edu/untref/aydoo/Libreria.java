package ar.edu.untref.aydoo;

import java.util.LinkedList;

public class Libreria {
	
	private Cliente cliente;
	private LinkedList<Cliente> listaDeClientes;
	
	public Libreria(){	
		listaDeClientes = new LinkedList<Cliente>();
	}

	public void agregarCliente(Cliente cliente) {
		listaDeClientes.add(cliente);
	}

	public Cliente getCliente(){
		return this.cliente;
	}
	
	public LinkedList<Cliente> getListaDeClientes(){
		return listaDeClientes;
	}
}
