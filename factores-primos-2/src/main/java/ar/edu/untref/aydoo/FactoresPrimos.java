package ar.edu.untref.aydoo;

import java.util.LinkedList;

/**
 * 
 * @author juliani
 * @parametros numero
 * 
 * Funcionalidades del programa: se pasa un numero por parametro e imprime por
 * pantalla la descomposicion en sus factores primos.
 * 
 * 
 */
public class FactoresPrimos {
	
	private int numero;
	private int factor;
	private LinkedList<String> factorizacion;	
	
	public FactoresPrimos(int numero)
	{
		this.numero = numero;
		factorizacion = new LinkedList<String>();
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public LinkedList<String> calcularFactoresPrimos()
	{
		factor = 2;
		while(this.numero >= 2)
		{
			if(this.numero%factor == 0){
				this.factorizacion.add(String.valueOf(factor));
				this.numero = this.numero/factor;
			}else{
				factor++;
			}
		}
		
		return this.factorizacion;
	}

}