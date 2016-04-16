package ar.edu.untref.aydoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Formateador {
	
	private FactoresPrimos factores;
	private LinkedList<String> factorizacionFormateada;
	private String nombreArchivo;
	
	public Formateador(FactoresPrimos factores){
		
		this.factores = factores;
		factorizacionFormateada = new LinkedList<String>();
	}

	public LinkedList<String> getFactorizacionFormateada() {
		return factorizacionFormateada;
	}
	
	public void formatear(String formato, String opcionAdicional){
		
		if(formato.equals("") || formato.toLowerCase().equals("--format=pretty")){
			
			if(!opcionAdicional.equals("")){
				String[] arrayOpcionAdicionalSeparada = opcionAdicional.split("=");
				this.nombreArchivo = arrayOpcionAdicionalSeparada[1];
			}else{
				this.nombreArchivo = "salida.txt";
			}
						
			factorizacionFormateada.add("Factores primos de "+ this.factores.getNumero()+": ");
			
			if(opcionAdicional.equals("") || opcionAdicional.equals("--output-file="+this.nombreArchivo)){
				for(int i = 0; i < this.factores.calcularFactoresPrimos().size();i++){
					factorizacionFormateada.add(this.factores.calcularFactoresPrimos().get(i)+" ");
				}				
			}else{
				factorizacionFormateada.add("Problemas de formato detectados");
			}
			
			this.escribirEnArchivo(this.nombreArchivo, factorizacionFormateada);
			 
		}else if(formato.toLowerCase().equals("--format=quiet")){
			
			factorizacionFormateada.add("");
			
			if(opcionAdicional.toLowerCase().equals("") || opcionAdicional.toLowerCase().equals("--sort:asc")){
				for(int i = this.factores.calcularFactoresPrimos().size()-1; i >= 0 ;i--){
					factorizacionFormateada.add(this.factores.calcularFactoresPrimos().get(i)+"\n");
				}				
			}else if(opcionAdicional.toLowerCase().equals("--sort:des")){
				for(int i = 0; i < this.factores.calcularFactoresPrimos().size() ;i++){
					factorizacionFormateada.add(this.factores.calcularFactoresPrimos().get(i)+"\n");
				}
			}			
			this.mostrar();
			
		 }else{
			 
			 factorizacionFormateada.add("Formato no aceptado. Las opciones posibles son : pretty o quiet");
		 }
	}
	
	public void mostrar(){
		
		for(String str : this.factorizacionFormateada){			
			System.out.print(str);
		}
	}
	
	public void escribirEnArchivo(String nombreArchivo, LinkedList<String> listaParaEscribir){
		
		File archivoNuevo = new File(this.nombreArchivo);
		try {
			BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoNuevo));
			for(String str : this.factorizacionFormateada){
				escritor.write(str);				
			}
			escritor.close();
		} catch (IOException e) {
			System.out.println("Error al escribir en archivo "+nombreArchivo);
		}
	}

	public String getNombreArchivo() {		
		return this.nombreArchivo;
	}
}
