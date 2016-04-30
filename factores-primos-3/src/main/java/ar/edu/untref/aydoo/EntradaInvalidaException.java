package ar.edu.untref.aydoo;

public class EntradaInvalidaException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public EntradaInvalidaException(String mensaje){
		super(mensaje);
	}
}
