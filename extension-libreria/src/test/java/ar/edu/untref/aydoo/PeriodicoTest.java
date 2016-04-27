package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class PeriodicoTest {

	@Test
	public void pagina12a30() {

		Periodico pagina12 = new Periodico("Diario", 1.0);
		pagina12.setPeriodicidad(30);

		Assert.assertEquals(30, pagina12.getPeriodicidad(), 0.0);
	}

	@Test
	public void seAgregaNombreAlPeriodicoAlSerCreado() {

		Periodico pagina12 = new Periodico("pagina 12", 1.0);
		pagina12.setPeriodicidad(2);
		Assert.assertEquals("pagina 12", pagina12.getNombre());
	}
}
