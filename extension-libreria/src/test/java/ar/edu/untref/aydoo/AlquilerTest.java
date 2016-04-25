package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class AlquilerTest {
	
	@Test
	public void elAlquilerSeIniciaConElPeriodoCorrectoEnFalse(){
		
		Alquiler alquiler = new Alquiler(1);		
		Assert.assertTrue(!alquiler.estaDentroDelPeriodoCorrecto());
	}
	
	@Test
	public void elAlquilerEstaDentroDelPeriodoCorrecto(){
		
		Alquiler alquiler = new Alquiler(1);
		alquiler.setEsPeriodoCorrecto(true);
		Assert.assertTrue(alquiler.estaDentroDelPeriodoCorrecto());
	}
	
	@Test
	public void elAlquilerDiarioSoloTieneDosDias(){
		
		Alquiler alquiler = new AlquilerDiario(2);
		Assert.assertTrue(!alquiler.estaDentroDelPeriodoCorrecto());		
	}
	
	@Test
	public void elAlquilerDiarioTieneTreintaDias(){
		
		Alquiler alquiler = new AlquilerDiario(30);
		Assert.assertTrue(!alquiler.estaDentroDelPeriodoCorrecto());
	}
	
	@Test
	public void elAlquilerDiarioEstaDentroDelPeriodoCorrecto(){
		
		Alquiler alquiler = new AlquilerDiario(15);
		Assert.assertTrue(alquiler.estaDentroDelPeriodoCorrecto());
	}
	
	@Test
	public void elAlquilerMensualEstaDentroDelPeriodoCorrecto(){
		
		Alquiler alquiler = new AlquilerMensual(2);
		Assert.assertTrue(alquiler.estaDentroDelPeriodoCorrecto());
	}

	@Test
	public void elAlquilerCuatrimestralEstaDentroDelPeriodoCorrecto(){
		
		Alquiler alquiler = new AlquilerCuatrimestral(1);
		Assert.assertTrue(alquiler.estaDentroDelPeriodoCorrecto());
	}
	
	@Test
	public void calculaElPrecioDelAlquilerDiario(){
		
		Alquiler alquilerDiario = new AlquilerDiario(10);
		Producto libro = new Libro("Libro de la selva", 10.0);
		
		((Libro)libro).setAlquiler(alquilerDiario);
		
		double precioEsperado = 100.0;
		
		Assert.assertEquals(precioEsperado, libro.getPrecio(), 0.0);
	}
}
