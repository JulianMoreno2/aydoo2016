package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class HacedorDeTeTest {
	
	@Test
	public void prepararEnEsteVaso(){
		
		Vaso vasoEsperado = new Vaso();
		
		vasoEsperado.setContenido("Te");
		
		HacedorDeTe hacedorDeTe = new HacedorDeTe();
		Vaso vasoObtenido = new Vaso();
		hacedorDeTe.prepararEnEsteVaso(vasoObtenido);
		
		Assert.assertEquals(vasoEsperado.getContenido().get(0), vasoObtenido.getContenido().get(0));		
	}


	
}
