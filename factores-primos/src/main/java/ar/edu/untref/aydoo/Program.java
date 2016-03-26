package ar.edu.untref.aydoo;

public class Program {

	 public static final void main(String arg[])
	 {
		 FactoresPrimos factorPrimo = new FactoresPrimos(Integer.parseInt(arg[0]));
		 
		 System.out.print("Factores primos de "+factorPrimo.getNumero()+":"
				 					+ factorPrimo.calcularFactoresPrimos());
		 System.out.println("");
	 }
}
