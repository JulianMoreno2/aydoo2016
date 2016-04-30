package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Formateador {
	
	/**
	 * Da formato a una lista
	 */
	public List<String> darFormato(List<String> lista, String formato){
		
		List<String> listaNueva = new LinkedList<String>();
		
		if("pretty".equals(formato) || " ".equals(formato)){
			
			for(String elemento : lista){
				listaNueva.add(elemento+" ");
			}
		
		}else if("quiet".equals(formato)){
			
			for(String elemento : lista){
				listaNueva.add(elemento+"\n");
			}
	
		}else {
			
			throw new EntradaInvalidaException("Formato no aceptado. Opciones: pretty o quiet");
		}
		
		return listaNueva;
	}
}
