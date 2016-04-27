package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ProductoTest {

	@Test (expected = RuntimeException.class)
	public void elPrecioDelProductoNoPuedeSerNegativoDesdeConstructor(){
		
		Producto producto = new Producto("nuevo", -2);
		
		int numeroEsperado = -2;
		
		Assert.assertEquals(numeroEsperado, producto.getPrecio(), 0.0);
	}
	
	@Test (expected = RuntimeException.class)
	public void elPrecioNoPuedeSerNegativoDesdeSetter(){
		
		Producto producto = new Producto("producto nuevo", 2.0);
		producto.setPrecio(-5.0);
		
		int numeroEsperado = -5;
		
		Assert.assertEquals(numeroEsperado, producto.getPrecio(),0.0);
	}
	
	@Test
	public void nombreProducto() {

		Producto test = new Producto("prod. test.", 1.00);
		Assert.assertEquals("prod. test.", test.getNombre());
	}

	@Test
	public void precioProducto()  {

		Producto test = new Producto("producto", 987.0);
		Assert.assertEquals(987.0, test.getPrecio(), 0.00);
	}
	
	@Test
	public void nombreProductoSetter() {	

		Producto test = new Producto("nombre", 1.00);
		test.setNombre("prod. test.2");
		Assert.assertEquals("prod. test.2", test.getNombre());
	}

	@Test
	public void precioProductoSetter(){		

		Producto test = new Producto("producto", 1.00);
		test.setPrecio(9844.10);
		Assert.assertEquals(9844.10, test.getPrecio(), 0.00);
	}
}
