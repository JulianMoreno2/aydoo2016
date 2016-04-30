package ar.edu.untref.aydoo;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class Parametrizador {
	
	private List<String> parametros;
	
	public Parametrizador() {		
		this.parametros = new LinkedList<String>();
		this.inicializarListaDeParametros();
	}
	
	private void inicializarListaDeParametros(){
		for(int i=0; i < 4; i++){
			this.parametros.add(i," ");
		}
	}
	
	public List<String> getParametros(){
		return parametros;
	}
	
	public List<String> alinearParametros(String[] arrayParametros){		
		
		List<String> lista = new LinkedList<String>();
		
		for(int i=0; i< arrayParametros.length; i++){			
			String parametro = arrayParametros[i].toLowerCase();
			lista.add(parametro);
		}
		if(lista.size() != 1){
			this.ordenarParametros(lista);			
		}
		
		this.parametros.remove(0);
		this.parametros.add(0, arrayParametros[0]);	
		
		return this.parametros;		
	}
	
	public List<String> listar(String[] parametros){
		
		List<String> lista = new LinkedList<String>();
		
		for(int i=0; i<parametros.length; i++){			
			String parametro = parametros[i].toLowerCase();
			lista.add(parametro);
		}		
		return lista;
	}
	
	public void ordenarParametros(List<String> lista){
		
		Iterator<String> iteradorDeParametros = lista.iterator();
		
		int flag = 0;
		
		while(iteradorDeParametros.hasNext()){
			
			String parametroActual = iteradorDeParametros.next();
			
			//Flag para que saltee el primer string que es el numero
			if(flag == 0){
				parametroActual = iteradorDeParametros.next();
				flag = 1;
			}
			
			String [] parametrosDivididosConIgual = parametroActual.split("=");
			String [] parametrosDivididosConDosPuntos = parametroActual.split(":");				
			
			if(parametrosDivididosConIgual.length == 2){
				
				if("--format".equals(parametrosDivididosConIgual[0])){
					
					this.parametros.remove(1);
					this.parametros.add(1,parametrosDivididosConIgual[1]);
					
				}else if("--output-file".equals(parametrosDivididosConIgual[0])){
					
					this.parametros.remove(3);
					this.parametros.add(3,parametrosDivididosConIgual[1]);
					
				}else{					
					throw new EntradaInvalidaException("Formato no aceptado");
				}
			}
			
			if(parametrosDivididosConDosPuntos.length == 2){
				if("--sort".equals(parametrosDivididosConDosPuntos[0])){
					this.parametros.remove(2);
					this.parametros.add(2,parametrosDivididosConDosPuntos[1]);
					
				}else{
					throw new EntradaInvalidaException("Formato no aceptado");
				}
			}
		}
	}
	
	public void compararListas(List<String> listaEnBlanco, List<String> listaConContenido){
		
		
	}
	/**
	private void agregarFormato(String parametro){
		
		String parametroDividido = parametro.substring(0,9);
		if("--format=".equals(parametroDividido)){
			this.parametros.add(1,parametro);
		}
	}
	
	private void agregarOrden(String orden){
		
		String ordenDividido = orden.substring(0,7);
		if("--sort:".equals(ordenDividido)){
			this.parametros.add(2,orden);
		}
	}
	
	private void agregarNombreDelArchivo(String nombreArchivo){
		
		String nombreArchivoDividido = nombreArchivo.substring(0,14);
		if("--output-file=".equals(nombreArchivoDividido)){
			String nombreArchivoDeSalida = nombreArchivo.substring(14, nombreArchivo.length());
			this.parametros.add(3,nombreArchivoDeSalida);
		}
	}
	*/
}