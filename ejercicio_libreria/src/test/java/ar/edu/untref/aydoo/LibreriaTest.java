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
	
	@Test
	public void unClienteCompraUnLibroEnNoviembreYNoEstaSuscripto(){
		
		Libreria libreria = new Libreria();
		Cliente marcos = new Cliente("Marcos");
		Mes noviembre = new Mes("Noviembre");
		Compra compra = new Compra(noviembre);
		Producto libroDeCocina = new Libro("Cocina profesional", 100);
		double montoEsperado = 100.0;
		
		compra.agregarProducto(libroDeCocina);
		marcos.agregarCompra(compra);
		libreria.agregarCliente(marcos);
		
		Assert.assertEquals(montoEsperado, libreria.calcularMontoTotal(noviembre,marcos), 0.0);		
	}
	
	@Test
	public void unClienteCompraUnLibroYUnArticuloDeLibreriaEnMayoYNoEstaSuscripto(){
		
		Libreria libreria = new Libreria();
		Cliente pablo = new Cliente("Pablo");
		Mes mayo = new Mes("Mayo");
		Compra compra = new Compra(mayo);
		Producto libroDeConstruccion = new Libro("Construcciones basicas", 50);
		Producto folios = new ArticuloDeLibreria("Folios", 10);
		double montoEsperado = 60.0;
		
		libreria.agregarCliente(pablo);
		compra.agregarProducto(libroDeConstruccion);
		compra.agregarProducto(folios);
		pablo.agregarCompra(compra);		
		
		Assert.assertEquals(montoEsperado, libreria.calcularMontoTotal(mayo, pablo), 0.0);
	}
	
	@Test
	public void elClienteJuanCompraCuatroArticulosEnAgosto(){
		
		Libreria libreria = new Libreria();
		Cliente juan = new Cliente("Juan");
		Mes agosto = new Mes("Agosto");
		Compra compra = new Compra(agosto);
		Producto elHobbit = new Libro("El Hobbit", 50);
		Producto lapicera1 = new ArticuloDeLibreria("Lapicera", 6.05);
		Producto lapicera2 = new ArticuloDeLibreria("Lapicera", 6.05);
		Periodicidad mensual = new Periodicidad(30);
		Producto elGrafico = new Revista("El Grafico", 30, mensual);
		
		libreria.agregarCliente(juan);
		compra.agregarProducto(elHobbit);
		compra.agregarProducto(lapicera1);
		compra.agregarProducto(lapicera2);
		compra.agregarProducto(elGrafico);
		juan.agregarCompra(compra);
				
		double montoEsperado = 92.1;
		
		Assert.assertEquals(montoEsperado, libreria.calcularMontoTotal(agosto, juan), 0.0);
	}
}
