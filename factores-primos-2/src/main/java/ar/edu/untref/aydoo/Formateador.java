package ar.edu.untref.aydoo;

import java.util.LinkedList;

public class Formateador {
	
	private FactoresPrimos factores;
	private LinkedList<String> factorizacionFormateada;
	
	public Formateador(FactoresPrimos factores){
		
		this.factores = factores;
		factorizacionFormateada = new LinkedList<String>();
	}

	public LinkedList<String> getFactorizacionFormateada() {
		return factorizacionFormateada;
	}
	
	public void formatear(String formato){
		
		if(formato.equals("") || formato.toLowerCase().equals("--format=pretty")){
			
			factorizacionFormateada.add("Factores primos de "+ this.factores.getNumero()+": ");
				
			for(int i = 0; i < this.factores.calcularFactoresPrimos().size();i++){
				
				factorizacionFormateada.add(this.factores.calcularFactoresPrimos().get(i)+" ");
			}
					 
			 
		}else if(formato.toLowerCase().equals("--format=quiet")){
			
			factorizacionFormateada.add("");
			 
			 for(int i = this.factores.calcularFactoresPrimos().size()-1; i >= 0 ;i--){
				
				 factorizacionFormateada.add(this.factores.calcularFactoresPrimos().get(i)+"\n");
			 }
			 
		 }else{
			 
			 factorizacionFormateada.add("Formato no aceptado. Las opciones posibles son : pretty o quiet");
		 }
	}
	
	public void mostrar(){
		
		for(String str : this.factorizacionFormateada){
			
			System.out.print(str);
		}
	}
}
