package ar.edu.untref.aydoo;

public class Program {

	 public static final void main(String arg[]){
		 
		 try{					 
			 
			FactoresPrimos factorPrimo = new FactoresPrimos(Integer.parseInt(arg[0]));
			Formateador formateador = new Formateador(factorPrimo);
						
			if(arg.length == 1){				 
						 
				formateador.formatear("","");
			 
		 	}else if (arg.length == 2){					
				
		 		formateador.formatear(arg[1],"");
		 		
		 	}else if (arg.length == 3){
		 		
		 		formateador.formatear(arg[1], arg[2]);
		 		
		 	}else{
		 		
		 		System.out.println("Errores de formato, vuelva a intentar");
		 	}
			
			System.out.println("");	
			 
		 }catch(ArrayIndexOutOfBoundsException e){
			 
			 System.out.println("Formato no aceptado. Las opciones posibles son : pretty o quiet");
		 }
	 }
}
