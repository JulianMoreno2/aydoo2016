package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Ordenador {
	
	public List<String> ordenar(List<String> listaDeFactores, String orden){
		
		List<String> listaDeFactoresOrdenados = new LinkedList<String>();
				
		if("des".equals(orden)){
			listaDeFactoresOrdenados = this.invertirLista(listaDeFactores);
		}else if("asc".equals(orden) || " ".equals(orden)){
			listaDeFactoresOrdenados = listaDeFactores;
		}else{
			throw new EntradaInvalidaException("Orden no aceptado. Opciones: des o asc");
		}

		return listaDeFactoresOrdenados;
	}
	
	public List<String> invertirLista(List<String> lista){
		
		List<String> listaInvertida = new LinkedList<String>();
		
		listaInvertida.add(lista.get(0));
		
		for(int i = lista.size(); i > 1 ;i--){
			String numeroActual = lista.get(i-1);
			listaInvertida.add(numeroActual);
		}		
		return listaInvertida;
	}

}
