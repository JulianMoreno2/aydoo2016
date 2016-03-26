package ar.edu.untref.aydoo;
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
	private String factorizacion;
	
	public FactoresPrimos(int numero)
	{
		this.numero = numero;
		this.factorizacion = "";
	}
	
	public int getNumero(){
		return this.numero;
	}

	public String calcularFactoresPrimos()
	{
		factor = 2;
		while(this.numero >= 2)
		{
			if(this.numero%factor == 0){
				this.factorizacion = factorizacion + " " + factor;
				this.numero = this.numero/factor;	
			
			}else{
				factor++;
			}
		}
		
		return this.factorizacion;
	}

	 public static final void main(String arg[])
	 {
		 FactoresPrimos factorPrimo = new FactoresPrimos(Integer.parseInt(arg[0]));
		 
		 System.out.print("Factores primos de "+factorPrimo.getNumero()+":"
				 					+ factorPrimo.calcularFactoresPrimos());
		 System.out.println("");
	 }
}