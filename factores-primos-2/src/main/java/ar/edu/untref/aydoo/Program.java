package ar.edu.untref.aydoo;

public class Program {

	 public static final void main(String arg[])
	 {	
		 FactoresPrimos factorPrimo = new FactoresPrimos(Integer.parseInt(arg[0]));
		 
		 String formato = arg[1].toLowerCase();
		 
		 if(formato.equals("--format=pretty")){
		
			 System.out.print("Factores primos de "+factorPrimo.getNumero()+": ");
		 			 
			 for(int i = 0; i < factorPrimo.calcularFactoresPrimos().size();i++){
				 System.out.print(factorPrimo.calcularFactoresPrimos().get(i)+" ");
			 }
			 System.out.println("");			 
		 
		 }else if(formato.equals("--format=quiet")){
							 
			 for(int i = 0; i < factorPrimo.calcularFactoresPrimos().size();i++){
				 System.out.println(factorPrimo.calcularFactoresPrimos().get(i)+" ");
			 }
			 System.out.println("");
			 
		 }else{
		
			 System.out.println("Formato no aceptado. Las opciones posibles son : pretty o quiet");
		 }
		
	 }

}
