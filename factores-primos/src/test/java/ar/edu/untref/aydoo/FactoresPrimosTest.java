package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class FactoresPrimosTest {
	
	@Test
    public void factorizarNumero2()
    {
        FactoresPrimos factorizador = new FactoresPrimos(2);
        String resultado = factorizador.calcularFactoresPrimos();
        Assert.assertEquals(" 2", resultado);
    }
	
	@Test
    public void factorizarNumero3()
    {
        FactoresPrimos factorizador = new FactoresPrimos(3);
        String resultado = factorizador.calcularFactoresPrimos();
        Assert.assertEquals(" 3", resultado);
    }
	
	@Test
    public void factorizarNumero4()
    {
        FactoresPrimos factorizador = new FactoresPrimos(4);
        String resultado = factorizador.calcularFactoresPrimos();
        Assert.assertEquals(" 2 2", resultado);
    }
	@Test
    public void factorizarNumero20()
    {
        FactoresPrimos factorizador = new FactoresPrimos(20);
        String resultado = factorizador.calcularFactoresPrimos();
        Assert.assertEquals(" 2 2 5", resultado);
    }
	
	@Test
    public void factorizarNumero90()
    {
        FactoresPrimos factorizador = new FactoresPrimos(90);
        String resultado = factorizador.calcularFactoresPrimos();
        Assert.assertEquals(" 2 3 3 5", resultado);
    }
    
	@Test
    public void factorizarNumero360()
    {
        FactoresPrimos factorizador = new FactoresPrimos(360);
        String resultado = factorizador.calcularFactoresPrimos();
        Assert.assertEquals(" 2 2 2 3 3 5", resultado);
    }
	
}
