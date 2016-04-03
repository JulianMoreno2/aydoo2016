package ar.edu.untref.aydoo;

public class Candidato{
	
	private String partido;
	private String nombre;
	
	public Candidato(String partido, String nombre){
		
		this.partido = partido;
		this.nombre = nombre;
	}

	public String getPartido() {
		return partido;
	}

	public String getNombre() {
		return nombre;
	}
}
