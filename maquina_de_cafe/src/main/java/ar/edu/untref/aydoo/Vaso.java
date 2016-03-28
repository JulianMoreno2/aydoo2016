package ar.edu.untref.aydoo;

import java.util.LinkedList;

public class Vaso {
	
	LinkedList<String> contenido;
	
	public Vaso(){
		contenido = new LinkedList<String>();
	}
	
	public void setContenido(String contenidoParaAgregar){
		this.contenido.add(contenidoParaAgregar);
	}
	
	public LinkedList<String> getContenido(){
		return this.contenido;
	}

}
