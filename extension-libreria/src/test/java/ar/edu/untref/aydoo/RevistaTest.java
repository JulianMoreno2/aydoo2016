package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class RevistaTest {

	@Test
	public void pagina12a30() {

		Revista pagina12 = new Revista(null, 1.0);
		pagina12.setPeriodicidad(30);

		Assert.assertEquals(30, pagina12.getPeriodicidad(), 0.0);
	}

	@Test
	public void seAgregaNombreAlRevistaAlSerCreado() {

		Revista pagina12 = new Revista("pagina 12", 1.0);
		pagina12.setPeriodicidad(2);
		Assert.assertEquals("pagina 12", pagina12.getNombre());
	}
}
