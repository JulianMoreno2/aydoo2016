package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import org.junit.Assert;

public class OrdenadorTest {

	@Test
	public void ordenaEnFormaDescendenteDosFactores(){
		
		Ordenador ordenador = new Ordenador();
		
		List<String> factoresDesordenados = new LinkedList<String>();
		factoresDesordenados.add("factor");
		factoresDesordenados.add("2");
		factoresDesordenados.add("5");
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("factor");
		listaEsperada.add("5");
		listaEsperada.add("2");
		
		Assert.assertEquals(listaEsperada, ordenador.ordenar(factoresDesordenados, "des"));
	}
	
	@Test
	public void ordenaEnFormaDescendenteCuatroFactores(){
		
		Ordenador ordenador = new Ordenador();
		
		List<String> factoresDesordenados = new LinkedList<String>();
		factoresDesordenados.add("factor");
		factoresDesordenados.add("2");
		factoresDesordenados.add("3");
		factoresDesordenados.add("3");
		factoresDesordenados.add("5");
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("factor");
		listaEsperada.add("5");
		listaEsperada.add("3");
		listaEsperada.add("3");
		listaEsperada.add("2");
		
		Assert.assertEquals(listaEsperada, ordenador.ordenar(factoresDesordenados, "des"));
	}
	
	@Test
	public void ordenarEnFormaAscendenteDosFactores(){
		
		Ordenador ordenador = new Ordenador();
		
		List<String> factoresDesordenados = new LinkedList<String>();
		factoresDesordenados.add("factor");
		factoresDesordenados.add("2");
		factoresDesordenados.add("5");
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("factor");
		listaEsperada.add("2");
		listaEsperada.add("5");
		
		Assert.assertEquals(listaEsperada, ordenador.ordenar(factoresDesordenados, "asc"));
	}
	
	@Test
	public void ordenaEnFormaAscendenteCuatroFactores(){
		
		Ordenador ordenador = new Ordenador();
		
		List<String> factoresDesordenados = new LinkedList<String>();
		factoresDesordenados.add("factor");
		factoresDesordenados.add("2");
		factoresDesordenados.add("3");
		factoresDesordenados.add("3");
		factoresDesordenados.add("5");
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("factor");
		listaEsperada.add("2");
		listaEsperada.add("3");
		listaEsperada.add("3");
		listaEsperada.add("5");
		
		Assert.assertEquals(listaEsperada, ordenador.ordenar(factoresDesordenados, "asc"));
	}
		
	@Test (expected = EntradaInvalidaException.class)
	public void ordenNoAceptado(){
		
		Ordenador ordenador = new Ordenador();		
		ordenador.ordenar(new LinkedList<String>(), "nada");
	}
}
