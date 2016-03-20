package ar.edu.untref.aydoo;

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
		while(this.numero > 1)
		{
			if((this.numero%5) == 0)
			{			
				System.out.println("5");
				this.numero = this.numero/5;				
			
			}else if((this.numero%3) == 0)
			{
				System.out.println("3");
				this.numero = this.numero/3;
			
			}else if((this.numero%2) == 0)
			{
				System.out.println("2");
				this.numero = this.numero/2;
			}
		}
	}

	 public static final void main(String arg[])
	 {
		 FactoresPrimos factorPrimo = new FactoresPrimos(Integer.parseInt(arg[0]));
		 
		 System.out.println("Factores primos de: "+factorPrimo.getNumero());
		 factorPrimo.calcularFactoresPrimos();
	 }
}
