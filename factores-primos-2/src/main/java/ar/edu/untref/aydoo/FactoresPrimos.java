package ar.edu.untref.aydoo;

import java.util.LinkedList;

/**
 * @author juliani
 * @parametros numero
 * 
 * Funcionalidades del programa: se pasa un numero por parametro e imprime por
 * pantalla la descomposicion en sus factores primos.
 */
public class FactoresPrimos {
	
	private int numero;
	private int numeroOriginal;
	private int factor;
	private LinkedList<String> factorizacion;	
	
	public FactoresPrimos(int numero)
	{
		this.numero = numero;
		this.numeroOriginal = numero;
		factorizacion = new LinkedList<String>();
	}
	
	public int getNumero(){
		
		return this.numero;
	}
	
	public int getFactor(){
		
		return this.factor;		
	}
	
	public LinkedList<String> calcularFactoresPrimos(){
		
		this.factor = 2;
		
		while(this.numero >= 2){
			
			if(this.numero%this.factor == 0){
				
				this.factorizacion.add(String.valueOf(this.factor));
				this.numero = this.numero/this.factor;
				
			}else{
				
				this.factor++;
			}
		}
		
		return this.factorizacion;
	}

	public int getNumeroOriginal(){
	
		return this.numeroOriginal;
	}
}