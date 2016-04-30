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
	
	private LinkedList<String> factorizacion;	
	
	public FactoresPrimos(){
		factorizacion = new LinkedList<String>();
	}
	
	public LinkedList<String> calcularFactoresPrimos(int numero){		
		int factor = 2;		
		this.factorizacion.add(String.valueOf(numero)+":");
		while(numero >= 2){			
			if(numero%factor == 0){				
				this.factorizacion.add(String.valueOf(factor));
				numero = numero/factor;				
			}else{				
				factor++;
			}
		}		
		return this.factorizacion;
	}
}