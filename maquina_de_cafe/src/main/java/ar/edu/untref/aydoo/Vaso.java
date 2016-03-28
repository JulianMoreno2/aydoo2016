package ar.edu.untref.aydoo;

import java.util.LinkedList;

public class Vaso {
	
	LinkedList<String> contenido;
	
	private static Vaso instance;
	
	private Vaso(){
		contenido = new LinkedList<String>();
	}
	
	public static Vaso getInstance(){
		
		if(instance == null){
			instance = new Vaso();
		}
		return instance;
	}
	
	public void setContenido(String contenidoParaAgregar){
		this.contenido.add(contenidoParaAgregar);
	}
	
	public LinkedList<String> getContenido(){
		return this.contenido;
	}

}
