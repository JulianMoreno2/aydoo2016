package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FactoresPrimosTest {
	
	@Test
    public void factorizarNumero2(){
		
        FactoresPrimos factorizador = new FactoresPrimos();
        LinkedList<String> resultado = factorizador.calcularFactoresPrimos(2);
        
        List<String> listaEsperada = new LinkedList<String>();
        listaEsperada.add("2"+":");
        listaEsperada.add("2");
        Assert.assertEquals(listaEsperada,resultado);
    }
	
	@Test
    public void factorizarNumero3(){
		
        FactoresPrimos factorizador = new FactoresPrimos();
        LinkedList<String> resultado = factorizador.calcularFactoresPrimos(3);
        
        List<String> listaEsperada = new LinkedList<String>();
        listaEsperada.add("3"+":");
        listaEsperada.add("3");
        Assert.assertEquals(listaEsperada,resultado);
    }
	
	@Test
    public void factorizarNumero4(){
		
        FactoresPrimos factorizador = new FactoresPrimos();
        LinkedList<String> resultado = factorizador.calcularFactoresPrimos(4);
        
        LinkedList<String> resultadoEsperado = new LinkedList<String>();
        resultadoEsperado.add("4"+":");
        resultadoEsperado.add("2");
        resultadoEsperado.add("2");
    
        Assert.assertEquals(resultadoEsperado, resultado);
    }
	
	@Test
    public void factorizarNumero20(){
		
        FactoresPrimos factorizador = new FactoresPrimos();
        LinkedList<String> resultado = factorizador.calcularFactoresPrimos(20);
        
        LinkedList<String> resultadoEsperado = new LinkedList<String>();
        resultadoEsperado.add("20"+":");
        resultadoEsperado.add("2");
        resultadoEsperado.add("2");
        resultadoEsperado.add("5");
        
        Assert.assertEquals(resultadoEsperado, resultado);
    }
	
	@Test
    public void factorizarNumero90(){
		
        FactoresPrimos factorizador = new FactoresPrimos();
        LinkedList<String> resultado = factorizador.calcularFactoresPrimos(90);
        
        LinkedList<String> resultadoEsperado = new LinkedList<String>();
        resultadoEsperado.add("90"+":");
        resultadoEsperado.add("2");
        resultadoEsperado.add("3");
        resultadoEsperado.add("3");
        resultadoEsperado.add("5");
        
        Assert.assertEquals(resultadoEsperado, resultado);
    }
    
	@Test
    public void factorizarNumero360(){
		
        FactoresPrimos factorizador = new FactoresPrimos();
        LinkedList<String> resultado = factorizador.calcularFactoresPrimos(360);
        
        LinkedList<String> resultadoEsperado = new LinkedList<String>();
        resultadoEsperado.add("360"+":");
        resultadoEsperado.add("2");
        resultadoEsperado.add("2");
        resultadoEsperado.add("2");
        resultadoEsperado.add("3");
        resultadoEsperado.add("3");
        resultadoEsperado.add("5");
        
        Assert.assertEquals(resultadoEsperado, resultado);
	}
}
