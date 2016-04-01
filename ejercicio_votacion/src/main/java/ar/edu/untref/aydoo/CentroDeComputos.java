package ar.edu.untref.aydoo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CentroDeComputos {

	private List<Voto> listaDeVotos;
	private List<String> listaDeProvincias;
	private List<Candidato> listaDeCandidatos;
	
	public CentroDeComputos(){
		
		listaDeVotos = new LinkedList<Voto>();
		listaDeProvincias = new LinkedList<String>();
		this.setProvincias();
		listaDeCandidatos = new LinkedList<Candidato>();
		this.setCandidatos();
	}
	
	public void emitirVoto(Voto votoEmitido) {
		
		if(this.validarVoto(votoEmitido)){

			listaDeVotos.add(votoEmitido);
		}		
	}

	public List<Voto> getListaDeVotos() {
		return listaDeVotos;
	}

	public Boolean validarVoto(Voto voto) {
		
		Iterator<String> itProvincias = listaDeProvincias.iterator();
		Iterator<Candidato> itCandidatos = listaDeCandidatos.iterator();
		
		while(itProvincias.hasNext()){
			
			if(itProvincias.next().equals(voto.getProvincia())){
				
				while(itCandidatos.hasNext()){
					
					Candidato candidatoActual = itCandidatos.next();
					
					if(candidatoActual.getPartido().equals(voto.getPartido()) && candidatoActual.getNombre().equals(voto.getCandidato())){
											
						return true;
					}
				}
			}						
			itProvincias.next();
		}		
		return false;
	}

	public void setProvincias() {
		
		listaDeProvincias.add("Capital Federal");
		listaDeProvincias.add("Buenos Aires");
		listaDeProvincias.add("Entre Rios");
		listaDeProvincias.add("Corrientes");
		listaDeProvincias.add("Misiones");
		listaDeProvincias.add("Formosa");
		listaDeProvincias.add("Chaco");
		listaDeProvincias.add("Santiago del Estero");
		listaDeProvincias.add("Cordoba");
		listaDeProvincias.add("San Luis");
		listaDeProvincias.add("La Pampa");
		listaDeProvincias.add("Rio Negro");
		listaDeProvincias.add("Chubut");
		listaDeProvincias.add("Santa Cruz");
		listaDeProvincias.add("Tierra del Fuego");
		listaDeProvincias.add("Neuquen");
		listaDeProvincias.add("Mendoza");
		listaDeProvincias.add("La Rioja");
		listaDeProvincias.add("San Juan");
		listaDeProvincias.add("Tucuman");
		listaDeProvincias.add("Jujuy");
		listaDeProvincias.add("Salta");
		listaDeProvincias.add("Catamarca");
		listaDeProvincias.add("Santa Fe");		
	}
	
	public void setCandidatos(){
		
		listaDeCandidatos.add(new Candidato("Fpv","Scioli"));
		listaDeCandidatos.add(new Candidato("Pro","Macri"));
		listaDeCandidatos.add(new Candidato("Frente Progresista","Stolbizer"));
		listaDeCandidatos.add(new Candidato("Frente de izquierda","Del Caño"));
	}
	
	
}
