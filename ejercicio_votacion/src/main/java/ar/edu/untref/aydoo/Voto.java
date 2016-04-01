package ar.edu.untref.aydoo;

public class Voto {
	
	private String provincia;
	private String partido;
	private String candidato;

	public Voto(String provincia, String partido, String candidato) {
		this.setProvincia(provincia);
		this.setPartido(partido);
		this.setCandidato(candidato);
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCandidato() {
		return candidato;
	}

	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}
	
	

}
