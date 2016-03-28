package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class MaquinaExpendedoraTest {
	
	@Test
    public void hacerCafeConLecheSinAzucar()
    {       
		Vaso vaso = new Vaso();
		HacedorDeCafeConLeche hacedorDeCafeConLeche = new HacedorDeCafeConLeche();
		hacedorDeCafeConLeche.prepararEnEsteVaso(vaso);
		Assert.assertEquals("Cafe", vaso.getContenido().get(0));
		Assert.assertEquals("Leche", vaso.getContenido().get(1));
    }	  
	
	@Test
    public void hacerTeConLecheSinAzucar()
    {       
		Vaso vaso = new Vaso();
		HacedorDeTeConLeche hacedorDeTeConLeche = new HacedorDeTeConLeche();
		hacedorDeTeConLeche.prepararEnEsteVaso(vaso);
		Assert.assertEquals("Te", vaso.getContenido().get(0));
		Assert.assertEquals("Leche", vaso.getContenido().get(1));
    }	
	
}
