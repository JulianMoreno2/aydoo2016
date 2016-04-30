package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FormateadorTest {
	
	@Test
	public void formateaListaDeUnElementoEnPretty(){
		
		Formateador formateador = new Formateador();
		
		List<String> listaAFormatear = new LinkedList<String>();
		listaAFormatear.add("2");
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("2 ");
		
		Assert.assertEquals(listaEsperada,formateador.darFormato(listaAFormatear, "pretty"));
	}
	
	@Test
	public void formateaListaDeTresElementosEnPretty(){
		
		Formateador formateador = new Formateador();
		
		List<String> listaAFormatear = new LinkedList<String>();
		listaAFormatear.add("2");
		listaAFormatear.add("2");
		listaAFormatear.add("2");
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("2 ");
		listaEsperada.add("2 ");
		listaEsperada.add("2 ");
		
		Assert.assertEquals(listaEsperada,formateador.darFormato(listaAFormatear, "pretty"));
	}
	
	@Test
	public void formateaListaDeUnElementoSinFormato(){
		
		Formateador formateador = new Formateador();
		
		List<String> listaAFormatear = new LinkedList<String>();
		listaAFormatear.add("2");
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("2 ");
		
		Assert.assertEquals(listaEsperada,formateador.darFormato(listaAFormatear, " "));
	}
	
	@Test
	public void formateaListaDeUnElementoConQUiet(){
		
		Formateador formateador = new Formateador();
		
		List<String> listaAFormatear = new LinkedList<String>();
		listaAFormatear.add("2");
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("2\n");
		
		Assert.assertEquals(listaEsperada,formateador.darFormato(listaAFormatear, "quiet"));
	}
	
	@Test
	public void formateaListaDeTresElementosConQUiet(){
		
		Formateador formateador = new Formateador();
		
		List<String> listaAFormatear = new LinkedList<String>();
		listaAFormatear.add("2");
		listaAFormatear.add("2");
		listaAFormatear.add("2");
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("2\n");
		listaEsperada.add("2\n");
		listaEsperada.add("2\n");
		
		Assert.assertEquals(listaEsperada,formateador.darFormato(listaAFormatear, "quiet"));
	}
	
	@Test (expected = EntradaInvalidaException.class)
	public void formatoNoAceptado(){
		
		Formateador formateador = new Formateador();
		
		formateador.darFormato(new LinkedList<String>(), "nada");
	}
}
