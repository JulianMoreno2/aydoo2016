package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {
	
	@Test
	public void emitirVotoTest(){
		
		CentroDeComputos centro = new CentroDeComputos();
		Voto votoEsperado = new Voto("Cordoba", "Fpv", "Scioli");
		centro.emitirVoto(votoEsperado);
		
		Voto votoObtenido = (Voto)centro.getListaDeVotos().get(0);
		
		Assert.assertEquals(votoEsperado, votoObtenido);		
	}
	
	@Test
	public void verificarSiElVotoEsValido(){
		
		CentroDeComputos centro = new CentroDeComputos();
		Voto votoEsperado = new Voto("Cordoba", "Fpv", "Scioli");
		
		centro.getListaDeVotos().add(votoEsperado);
		
		Boolean validezDelVoto = centro.validarVoto(votoEsperado);
		
		Assert.assertEquals(true, validezDelVoto);		
	}

}
