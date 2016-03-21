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
	
	public FactoresPrimos(int numero)
	{
		this.numero = numero;
	}
	
	public int getNumero(){
		return this.numero;
	}

	public void calcularFactoresPrimos()
	{
		while(((this.numero%5) == 0) || ((this.numero%3) == 0) || ((this.numero%2) == 0))
		{
			if((this.numero%5) == 0)
			{			
				System.out.print(" 5 ");
				this.numero = this.numero/5;				
			
			}else if((this.numero%3) == 0)
			{
				System.out.print(" 3 ");
				this.numero = this.numero/3;
			
			}else if((this.numero%2) == 0)
			{
				System.out.print(" 2 ");
				this.numero = this.numero/2;
			}
		}
	}

	 public static final void main(String arg[])
	 {
		 FactoresPrimos factorPrimo = new FactoresPrimos(Integer.parseInt(arg[0]));
		 
		 System.out.print("Factores primos de "+factorPrimo.getNumero()+":");
		 factorPrimo.calcularFactoresPrimos();
		 System.out.println("");
	 }
}