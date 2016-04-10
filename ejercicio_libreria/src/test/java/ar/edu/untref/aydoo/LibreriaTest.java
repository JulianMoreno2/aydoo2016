package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class LibreriaTest {

	@Test
	public void permiteAgregarUnCliente(){
		
		Libreria libreria = new Libreria();
		Cliente cliente = new Cliente("Pablo");
		libreria.agregarCliente(cliente);
				
		Assert.assertEquals(cliente, libreria.getListaDeClientes().get(0));
	}
}
