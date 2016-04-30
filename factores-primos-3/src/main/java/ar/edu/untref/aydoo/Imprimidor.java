package ar.edu.untref.aydoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Imprimidor {
	
	private Formateador formateador;
	private Parametrizador parametrizador;
	private FactoresPrimos factores;
	private Ordenador ordenador;	
	
	public Imprimidor(){
		this.formateador = new Formateador();
		this.ordenador = new Ordenador();
		this.factores = new FactoresPrimos();
		this.parametrizador = new Parametrizador();
	}
	
	public void imprimir(String[] parametros){
		
		List<String> parametrosAlineados = this.parametrizador.alinearParametros(parametros);
		
		int numero = Integer.parseInt(parametrosAlineados.get(0));
		
		List<String> factoresPrimos = this.factores.calcularFactoresPrimos(numero);
		
		List<String> factoresPrimosOrdenados = this.ordenador.ordenar(factoresPrimos, parametrosAlineados.get(2));
		
		if(!factoresPrimosOrdenados.isEmpty()){
			this.seleccionarTipoDeImpresion(factoresPrimosOrdenados, parametrosAlineados.get(1), parametrosAlineados.get(3));
		}
	}

	private void seleccionarTipoDeImpresion(List<String> lista, String formato, String salida){
		
		lista = this.formateador.darFormato(lista, formato);
		
		if(salida.length() > 4){			
			this.imprimirEnArchivo(lista, salida);
			
		}else if(" ".equals(salida)){			
			this.imprimirEnConsola(lista);
		
		}else{			
			throw new EntradaInvalidaException("No se pudo imprimir");
		}
	}
	
	private void imprimirEnArchivo(List<String> lista, String salida){
		
		String nombreArchivo = salida;
		
		File archivo = new File(nombreArchivo);
				
		try {
			BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo));
			int flag = 0;
			for(String str : lista){
				if(flag == 0){
					escritor.write("Factores primos de "+str+": ");				
					flag = 1;
				}else{
					escritor.write(str);
				}
			}
			escritor.close();
		} catch (IOException e) {
			System.out.println("Error al escribir en archivo "+nombreArchivo);
		}		
	}
	
	private void imprimirEnConsola(List<String> lista){
		
		int flag = 0;
		for(String str : lista){	
			if(flag == 0){
				System.out.print("Factores primos de "+str);
				flag = 1;
			}else{
				System.out.print(str);				
			}
		}
		System.out.println("");
	}
}
