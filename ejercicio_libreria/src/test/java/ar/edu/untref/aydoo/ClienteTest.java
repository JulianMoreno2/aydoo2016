package ar.edu.untref.aydoo;

import org.junit.Test;

public class ClienteTest {
	
	@Test
	public void clienteHaceUnaCompraEnAgosto(){
		
		Cliente cliente = new Cliente("Pablo");
		Mes agosto = new Mes("Agosto");
		Compra compra = new Compra(agosto);
	}

}
