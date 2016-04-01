package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class AzucareroTest {
	
	@Test
	public void ponerAzucarEnVaso(){
		
		Vaso vasoEsperado = new Vaso();
		Azucarero azucarero = new Azucarero();
		vasoEsperado.setContenido("2 de azucar");
		
		Vaso vasoObtenido = new Vaso();
		azucarero.ponerNenEsteVaso(vasoObtenido, 2);
		
		Assert.assertEquals(vasoEsperado.getContenido().get(0), vasoObtenido.getContenido().get(0));
	}

}
