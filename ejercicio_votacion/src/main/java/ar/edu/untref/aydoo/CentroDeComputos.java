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
	
	public void emitirVoto(Voto votoEmitido){
		
		if(this.validarVoto(votoEmitido)){

			this.listaDeVotos.add(votoEmitido);
		}		
	}

	public List<Voto> getListaDeVotos(){
		return this.listaDeVotos;
	}

	public Boolean validarVoto(Voto voto){
		
		Iterator<String> itProvincias = this.listaDeProvincias.iterator();
		Iterator<Candidato> itCandidatos = this.listaDeCandidatos.iterator();
		
		String provinciaActual = "";
		Candidato candidatoActual = null;
		
		while(itProvincias.hasNext()){
			
			provinciaActual = itProvincias.next();
			
			if(provinciaActual.equals(voto.getProvincia())){
			
				while(itCandidatos.hasNext()){
					
					candidatoActual = itCandidatos.next();
					
					if(candidatoActual.getPartido().equals(voto.getPartido()) && candidatoActual.getNombre().equals(voto.getCandidato())){
						
						return true;
					}
				}
			}						
			
		}		
		return false;
	}

	public void setProvincias(){
		
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
		listaDeCandidatos.add(new Candidato("Frente de izquierda","Del Canio"));
	}

	public Candidato candidatoGanadorNacional(){
		
		Voto votoActual;
		Candidato candidatoGanador = null;
		
		int votosMacri = 0;
		int votosScioli = 0;
		int votosStolbizer = 0;
		int votosDelCanio = 0;
		
		Iterator<Voto> itVotos = listaDeVotos.iterator();
		
		while(itVotos.hasNext()){
			
			votoActual = itVotos.next();
			
			if(votoActual.getCandidato().equals("Macri")){
				
				votosMacri++;
			
			}else if(votoActual.getCandidato().equals("Scioli")){
				
				votosScioli++;
			
			}else if(votoActual.getCandidato().equals("Stolbizer")){
				
				votosStolbizer++;
			
			}else if(votoActual.getCandidato().equals("Del Canio")){
				
				votosDelCanio++;
			}			
		}
		
		if(votosMacri > votosScioli && votosMacri > votosStolbizer && votosMacri > votosDelCanio){
			
			candidatoGanador = new Candidato("Pro","Macri");
		
		}else if (votosScioli > votosMacri && votosScioli > votosStolbizer && votosScioli > votosDelCanio){
			
			candidatoGanador = new Candidato("Fpv","Scioli");
		
		}else if (votosStolbizer > votosMacri && votosStolbizer > votosScioli && votosStolbizer > votosDelCanio){
			
			candidatoGanador =  new Candidato("Frente Progresista","Stolbizer");
			
		}else if (votosDelCanio > votosMacri && votosDelCanio > votosScioli && votosDelCanio > votosStolbizer){
			
			candidatoGanador = new Candidato("Frente de izquierda","Del Canio");
		}
		
		return candidatoGanador;
	}

	public String partidoGanadorEnLaProvincia(String provincia) {
		
		String partidoGanador = "";
		
		Iterator<Voto> itVotos = listaDeVotos.iterator();
		Voto votoActual = null;
		
		int votosPro = 0;
		int votosFpv = 0;
		int votosFrenteProgresista = 0;
		int votosFrenteIzquierda = 0;
		
		while(itVotos.hasNext()){
		
			votoActual = itVotos.next();
			
			if(votoActual.getProvincia().equals(provincia)){
				
				if(votoActual.getPartido().equals("Pro")){
					
					votosPro++;
					
				}else if(votoActual.getPartido().equals("Fpv")){
					
					votosFpv++;
					
				}else if(votoActual.getPartido().equals("Frente Progresista")){
					
					votosFrenteProgresista++;
					
				}else if(votoActual.getPartido().equals("Frente de izquierda")){
					
					votosFrenteIzquierda++;
				}
			}					
		}
		
		if(votosPro > votosFpv && votosPro > votosFrenteProgresista && votosPro > votosFrenteIzquierda){
			
			partidoGanador = "Pro";
		
		}else if (votosFpv > votosPro && votosFpv > votosFrenteProgresista && votosFpv > votosFrenteIzquierda){
			
			partidoGanador = "Fpv";
		
		}else if (votosFrenteProgresista > votosPro && votosFrenteProgresista > votosFpv && votosFrenteProgresista > votosFrenteIzquierda){
			
			partidoGanador =  "Frente Progresista";
			
		}else if (votosFrenteIzquierda > votosPro && votosFrenteIzquierda > votosFpv && votosFrenteIzquierda > votosFrenteProgresista){
			
			partidoGanador = "Frente de izquierda";
		}
		
		return partidoGanador;
	}
}
