package ar.edu.untref.aydoo;

public class Candidato{
	
	private String partido;
	private String nombre;
	
	public Candidato(String partido, String nombre){
		
		this.setPartido(partido);
		this.setNombre(nombre);
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
