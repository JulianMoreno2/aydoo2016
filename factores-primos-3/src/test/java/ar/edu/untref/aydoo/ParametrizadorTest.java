package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class ParametrizadorTest {
	
	@Test
	public void laListaTieneUnSoloElemento(){
		
		Parametrizador parametrizador = new Parametrizador();
		
		String[] parametros = new String[1];
		parametros[0] = "20";
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("20");
		listaEsperada.add(" ");
		listaEsperada.add(" ");
		listaEsperada.add(" ");
		
		Assert.assertEquals(listaEsperada, parametrizador.alinearParametros(parametros));
		
	}
	
	@Test
	public void inicializaListaDeParametrosCorrectamente(){
		
		Parametrizador parametrizador = new Parametrizador();
		
		List<String> listaEsperada = new LinkedList<String>();
		
		listaEsperada.add(" ");
		listaEsperada.add(" ");
		listaEsperada.add(" ");
		listaEsperada.add(" ");
		
		Assert.assertEquals(listaEsperada, parametrizador.getParametros());
	}
	
	@Test
	public void listaParametrosAPartirDeUnArray(){
		
		Parametrizador parametrizador = new Parametrizador();
		
		String[] parametros = new String[4];
		
		parametros[0] = "2";
		parametros[1] = "--format=pretty";
		parametros[2] = "--sort:asc";
		parametros[3] = "--output-file=salida.txt";
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("2");
		listaEsperada.add("--format=pretty");
		listaEsperada.add("--sort:asc");
		listaEsperada.add("--output-file=salida.txt");
		
		Assert.assertEquals(listaEsperada,  parametrizador.listar(parametros));
	}
	
	@Test
	public void ordenaLaListaDeParametrosSinFactorPrimo(){
		
		Parametrizador parametrizador = new Parametrizador();
		
		List<String> listaDesordenada = new LinkedList<String>();
		listaDesordenada.add("");
		listaDesordenada.add("--sort:asc");
		listaDesordenada.add("--format=pretty");
		listaDesordenada.add("--output-file=salida.txt");
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add(" ");
		listaEsperada.add("pretty");
		listaEsperada.add("asc");
		listaEsperada.add("salida.txt");
		
		parametrizador.ordenarParametros(listaDesordenada);
		
		Assert.assertEquals(listaEsperada, parametrizador.getParametros());		
	}
	
	@Test
	public void alineaUnParametroEnUnaListaConFactorPrimo(){
		
		Parametrizador parametrizador = new Parametrizador();
		
		String[] parametros = new String[2];		
		parametros[0] = "2";
		parametros[1] = "--format=quiet";
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("2");
		listaEsperada.add("quiet");
		listaEsperada.add(" ");
		listaEsperada.add(" ");
		
		Assert.assertEquals(listaEsperada, parametrizador.alinearParametros(parametros));	
	}
	
	@Test
	public void alineaDosParametrosEnUnaListaConFactorPrimo(){
		
		Parametrizador parametrizador = new Parametrizador();
		
		String[] parametros = new String[3];		
		parametros[0] = "2";
		parametros[1] = "--sort:asc";
		parametros[2] = "--format=quiet";
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("2");
		listaEsperada.add("quiet");
		listaEsperada.add("asc");
		listaEsperada.add(" ");
		
		Assert.assertEquals(listaEsperada, parametrizador.alinearParametros(parametros));	
	}
	
	@Test
	public void alineaTresParametrosEnUnaListaConFactorPrimo(){
		
		Parametrizador parametrizador = new Parametrizador();
		
		String[] parametros = new String[4];		
		parametros[0] = "2";
		parametros[1] = "--sort:asc";
		parametros[2] = "--output-file=salida.txt";
		parametros[3] = "--format=quiet";
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("2");
		listaEsperada.add("quiet");
		listaEsperada.add("asc");
		listaEsperada.add("salida.txt");
		
		Assert.assertEquals(listaEsperada, parametrizador.alinearParametros(parametros));	
	}
	
	@Test
	public void alineaLosParametrosCorrectamente(){
		
		Parametrizador parametrizador = new Parametrizador();
		
		String[] parametros = new String[4];		
		parametros[0] = "2";
		parametros[1] = "--format=pretty";
		parametros[2] = "--sort:asc";
		parametros[3] = "--output-file=salida.txt";
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("2");
		listaEsperada.add("pretty");
		listaEsperada.add("asc");
		listaEsperada.add("salida.txt");
		
		Assert.assertEquals(listaEsperada, parametrizador.alinearParametros(parametros));
	}
	
	@Test
	public void alineaLosParametrosSoloPasaDosParametros(){
		
		Parametrizador parametrizador = new Parametrizador();
		
		String[] parametros = new String[3];		
		parametros[0] = "2";
		parametros[1] = "--sort:asc";
		parametros[2] = "--output-file=salida.txt";
		
		List<String> listaEsperada = new LinkedList<String>();
		listaEsperada.add("2");
		listaEsperada.add(" ");
		listaEsperada.add("asc");
		listaEsperada.add("salida.txt");
		
		Assert.assertEquals(listaEsperada, parametrizador.alinearParametros(parametros));
	}
	
	@Test (expected = EntradaInvalidaException.class)
	public void formatoConIgualEnMedioNoAceptado(){
		
		Parametrizador parametrizador = new Parametrizador();
		
		List<String> lista = new LinkedList<String>();
		
		lista.add("2");
		lista.add("asd=asd");
		
		parametrizador.ordenarParametros(lista);
	}
	
	@Test (expected = EntradaInvalidaException.class)
	public void formatoConDosPuntosNoAceptado(){
		
		Parametrizador parametrizador = new Parametrizador();
		
		List<String> lista = new LinkedList<String>();
		
		lista.add("2");
		lista.add("a:asd");
		
		parametrizador.ordenarParametros(lista);
	}
}
