package ar.edu.untref.aydoo;

public class Voto {
	
	private String provincia;
	private Candidato candidato;

	public Voto(String provincia, Candidato candidato) {
		
		this.provincia = provincia;
		this.candidato = candidato;
	}

	public String getProvincia() {
		
		return provincia;
	}

	public Candidato getCandidato() {
		
		return candidato;
	}
}
