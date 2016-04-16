package ar.edu.untref.aydoo;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class FormateadorTest {
	
	@Test
	public void formatear2ConPretty(){
		
		FactoresPrimos factores = new FactoresPrimos(2);
		Formateador formato = new Formateador(factores);
		
		formato.formatear("--format=pretty","");
		
		LinkedList<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("Factores primos de "+ factores.getNumeroOriginal()+": ");
		listaEsperada.add("2 ");
	
		Assert.assertEquals(listaEsperada, formato.getFactorizacionFormateada());
	}
	
	@Test
	public void formatear4ConPretty(){
		
		FactoresPrimos factores = new FactoresPrimos(4);
		Formateador formato = new Formateador(factores);
		
		formato.formatear("--format=pretty","");
		
		LinkedList<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("Factores primos de "+ factores.getNumeroOriginal()+": ");
		listaEsperada.add("2 ");
		listaEsperada.add("2 ");
		
		Assert.assertEquals(listaEsperada, formato.getFactorizacionFormateada());
	}
	
	@Test
	public void formatear10ConPretty(){
		
		FactoresPrimos factores = new FactoresPrimos(10);
		Formateador formato = new Formateador(factores);
		
		formato.formatear("--format=pretty","");
		
		LinkedList<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("Factores primos de "+ factores.getNumeroOriginal()+": ");
		listaEsperada.add("2 ");
		listaEsperada.add("5 ");
		
		Assert.assertEquals(listaEsperada, formato.getFactorizacionFormateada());
	}
	
	@Test
	public void formatear10ConQuiet(){
		
		FactoresPrimos factores = new FactoresPrimos(10);
		Formateador formato = new Formateador(factores);
		
		formato.formatear("--format=quiet","");
		
		LinkedList<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("");
		listaEsperada.add("5\n");
		listaEsperada.add("2\n");
	
		Assert.assertEquals(listaEsperada, formato.getFactorizacionFormateada());
	}
	
	@Test
	public void formatear10sinFormat(){
		
		FactoresPrimos factores = new FactoresPrimos(10);
		Formateador formato = new Formateador(factores);
		
		formato.formatear("","");
		
		LinkedList<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("Factores primos de "+ factores.getNumeroOriginal()+": ");
		listaEsperada.add("2 ");
		listaEsperada.add("5 ");
	
		Assert.assertEquals(listaEsperada, formato.getFactorizacionFormateada());
	}
	
	@Test
	public void formatear10ConQuietYSinOrdenEspecificado(){
		
		FactoresPrimos factores = new FactoresPrimos(10);
		Formateador formato = new Formateador(factores);
		
		formato.formatear("--format=quiet","");
		
		LinkedList<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("");
		listaEsperada.add("5\n");
		listaEsperada.add("2\n");
		
		Assert.assertEquals(listaEsperada, formato.getFactorizacionFormateada());
	}
	
	@Test
	public void formatear10ConQuietYConOrdenAscendente(){
		
		FactoresPrimos factores = new FactoresPrimos(10);
		Formateador formato = new Formateador(factores);
		
		formato.formatear("--format=quiet","--sort:asc");
		
		LinkedList<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("");
		listaEsperada.add("5\n");
		listaEsperada.add("2\n");
		
		Assert.assertEquals(listaEsperada, formato.getFactorizacionFormateada());
	}
	
	@Test
	public void formatear10ConQuietYConOrdenDescendente(){
		
		FactoresPrimos factores = new FactoresPrimos(10);
		Formateador formato = new Formateador(factores);
		
		formato.formatear("--format=quiet","--sort:des");
		
		LinkedList<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("");
		listaEsperada.add("2\n");
		listaEsperada.add("5\n");
		
		Assert.assertEquals(listaEsperada, formato.getFactorizacionFormateada());
	}
	
	@Test
	public void formatear10ConPrettyYGuardarSinEspecificarArchivo(){
		
		FactoresPrimos factores = new FactoresPrimos(10);
		Formateador formato = new Formateador(factores);
		
		formato.formatear("--format=pretty","");
		
		LinkedList<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("Factores primos de "+ factores.getNumeroOriginal()+": ");
		listaEsperada.add("2 ");
		listaEsperada.add("5 ");
		String nombreDeArchivoEsperado = "salida.txt";
		
		Assert.assertEquals(nombreDeArchivoEsperado, formato.getNombreArchivo());
	}
}
