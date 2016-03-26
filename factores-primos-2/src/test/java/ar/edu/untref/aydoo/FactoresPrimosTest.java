package ar.edu.untref.aydoo;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class FactoresPrimosTest {
	
	@Test
    public void factorizarNumero2()
    {
        FactoresPrimos factorizador = new FactoresPrimos(2);
        LinkedList<String> resultado = factorizador.calcularFactoresPrimos();
        Assert.assertEquals(" 2", " " + resultado.get(0));
    }
	
	@Test
    public void factorizarNumero3()
    {
        FactoresPrimos factorizador = new FactoresPrimos(3);
        LinkedList<String> resultado = factorizador.calcularFactoresPrimos();
        Assert.assertEquals(" 3", " " + resultado.get(0));
    }
	
	@Test
    public void factorizarNumero4()
    {
        FactoresPrimos factorizador = new FactoresPrimos(4);
        LinkedList<String> resultado = factorizador.calcularFactoresPrimos();
        Assert.assertEquals(" 2 2", " " + resultado.get(0)+" "+resultado.get(1));
    }
	
	@Test
    public void factorizarNumero20()
    {
        FactoresPrimos factorizador = new FactoresPrimos(20);
        LinkedList<String> resultado = factorizador.calcularFactoresPrimos();
        Assert.assertEquals(" 2 2 5", " " + resultado.get(0)+" "+resultado.get(1)+" "+resultado.get(2));
    }
	
	@Test
    public void factorizarNumero90()
    {
        FactoresPrimos factorizador = new FactoresPrimos(90);
        LinkedList<String> resultado = factorizador.calcularFactoresPrimos();
        Assert.assertEquals(" 2 3 3 5", " " + resultado.get(0)+" "+resultado.get(1)+" "+resultado.get(2)+" "+resultado.get(3));
    }
    
	@Test
    public void factorizarNumero360()
    {
        FactoresPrimos factorizador = new FactoresPrimos(360);
        LinkedList<String> resultado = factorizador.calcularFactoresPrimos();
        Assert.assertEquals(" 2 2 2 3 3 5", " " + resultado.get(0)+" "+resultado.get(1)+" "+resultado.get(2)+" "+resultado.get(3)+" "+resultado.get(4)+" "+resultado.get(5));
    }
}
