package ar.edu.untref.aydoo;

public class Program {

	 public static final void main(String arg[])
	 {	
		 try
		 {			 
			 FactoresPrimos factorPrimo = new FactoresPrimos(Integer.parseInt(arg[0]));
			 
			 if(arg.length == 1){
				 
				 System.out.print("Factores primos de "+factorPrimo.getNumero()+": ");
				 
				 for(int i = 0; i < factorPrimo.calcularFactoresPrimos().size();i++){
					 System.out.print(factorPrimo.calcularFactoresPrimos().get(i)+" ");
				 }
				 System.out.println("");	
				 
				 
			 }else if (arg.length == 2){
	
				 if(arg[1].toLowerCase().equals("--format=pretty") || arg[1].toLowerCase() == null){
					 
					 System.out.print("Factores primos de "+factorPrimo.getNumero()+": ");
					 
					 for(int i = 0; i < factorPrimo.calcularFactoresPrimos().size();i++){
						 System.out.print(factorPrimo.calcularFactoresPrimos().get(i)+" ");
					 }
					 System.out.println("");			 
					 
				 }else if(arg[1].toLowerCase().equals("--format=quiet")){
					 
					 for(int i = factorPrimo.calcularFactoresPrimos().size()-1; i >= 0 ;i--){
						 System.out.println(factorPrimo.calcularFactoresPrimos().get(i)+" ");
					 }
					 System.out.println("");
					 
				 }else{
					 
					 System.out.println("Formato no aceptado. Las opciones posibles son : pretty o quiet");
				 }
			 }
			 
		 }catch(ArrayIndexOutOfBoundsException e){
			 
			 System.out.println("Formato no aceptado. Las opciones posibles son : pretty o quiet");
		 }
	 }
}
