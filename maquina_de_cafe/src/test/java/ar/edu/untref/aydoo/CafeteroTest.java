package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class CafeteroTest {
	
	@Test
	public void prepararEnEsteVaso(){
		
		Vaso vasoEsperado = new Vaso();
		Cafetero cafetero = new Cafetero();
		vasoEsperado.setContenido("Cafe");
		
		Vaso vasoObtenido = new Vaso();
		cafetero.prepararEnEsteVaso(vasoObtenido);
		
		Assert.assertEquals(vasoEsperado.getContenido().get(0), vasoObtenido.getContenido().get(0));		
	}
}
