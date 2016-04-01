package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {
	
	@Test
	public void emitirVotoTest(){
		
		CentroDeComputos centro = new CentroDeComputos();
		Voto votoEsperado = new Voto("Cordoba", "Fpv", "Scioli");
		centro.emitirVoto(votoEsperado);
	
		Voto votoObtenido = (Voto)centro.getListaDeVotos().get(0);
		
		Assert.assertEquals(votoEsperado, votoObtenido);		
	}
	
	@Test
	public void verificarSiElVotoEsValido(){
		
		CentroDeComputos centro = new CentroDeComputos();
		Voto votoEsperado = new Voto("Cordoba", "Fpv", "Scioli");
		
		centro.getListaDeVotos().add(votoEsperado);
		
		Boolean validezDelVoto = centro.validarVoto(votoEsperado);
		
		Assert.assertEquals(true, validezDelVoto);		
	}
	
	@Test
	public void verificarVotoConPartidoInvalido(){
		
		CentroDeComputos centro = new CentroDeComputos();
		Voto votoEsperado = new Voto("Cordoba", "Pro", "Scioli");
		
		centro.getListaDeVotos().add(votoEsperado);
		
		Boolean validezDelVoto = centro.validarVoto(votoEsperado);
		
		Assert.assertEquals(false, validezDelVoto);		
	}

	@Test
	public void recuentoDeVotosAnivelNacionalConDosCandidatos(){
		
		CentroDeComputos centro = new CentroDeComputos();
		
		Voto votoScioli1 = new Voto("Formosa", "Fpv", "Scioli");
		Voto votoScioli2 = new Voto("Formosa", "Fpv", "Scioli");
		Voto votoMacri1 = new Voto("Formosa", "Pro", "Macri");
		
		centro.emitirVoto(votoScioli1);
		centro.emitirVoto(votoScioli2);		
		centro.emitirVoto(votoMacri1);
		
		Candidato candidatoEspeado = new Candidato("Fpv", "Scioli");
		
		Candidato candidatoObtenido = centro.candidatoGanadorNacional();
		
		Assert.assertEquals(candidatoEspeado.getNombre(), candidatoObtenido.getNombre());		
	}
	
	@Test
	public void recuentoDeVotosAnivelNacionalConTodosLosCandidatos(){
		
		CentroDeComputos centro = new CentroDeComputos();
		
		centro.emitirVoto(new Voto("Buenos Aires", "Pro", "Macri"));
		centro.emitirVoto(new Voto("Buenos Aires", "Pro", "Macri"));
		centro.emitirVoto(new Voto("Buenos Aires", "Pro", "Macri"));
		centro.emitirVoto(new Voto("Buenos Aires", "Fpv", "Scioli"));
		centro.emitirVoto(new Voto("Buenos Aires", "Fpv", "Scioli"));		
		centro.emitirVoto(new Voto("Buenos Aires", "Fpv", "Scioli"));
		centro.emitirVoto(new Voto("Buenos Aires", "Fpv", "Scioli"));
		centro.emitirVoto(new Voto("Buenos Aires", "Fpv", "Scioli"));
		centro.emitirVoto(new Voto("Buenos Aires", "Frente Progresista", "Stolbizer"));
		centro.emitirVoto(new Voto("Buenos Aires", "Frende de izquierda", "Del Canio"));
		
		Candidato candidatoEspeado = new Candidato("Fpv", "Scioli");
		
		Candidato candidatoObtenido = centro.candidatoGanadorNacional();
		
		Assert.assertEquals(candidatoEspeado.getNombre(), candidatoObtenido.getNombre());		
	}

	@Test
	public void ganadorDeEleccionesDeUnPartidoAnivelProvincia(){
		
		CentroDeComputos centro = new CentroDeComputos();
		
		centro.emitirVoto(new Voto("Buenos Aires", "Pro", "Macri"));
		centro.emitirVoto(new Voto("Cordoba", "Pro", "Macri"));
		centro.emitirVoto(new Voto("Cordoba", "Pro", "Macri"));
		centro.emitirVoto(new Voto("Buenos Aires", "Fpv", "Scioli"));
		centro.emitirVoto(new Voto("Buenos Aires", "Fpv", "Scioli"));		
		centro.emitirVoto(new Voto("Buenos Aires", "Fpv", "Scioli"));
		centro.emitirVoto(new Voto("Cordoba", "Fpv", "Scioli"));
		centro.emitirVoto(new Voto("Formosa", "Fpv", "Scioli"));
		centro.emitirVoto(new Voto("Cordoba", "Frente Progresista", "Stolbizer"));
		centro.emitirVoto(new Voto("Buenos Aires", "Frende de izquierda", "Del Canio"));
		
		String partidoEsperado = "Pro";
		String partidoObtenido = centro.partidoGanadorEnLaProvincia("Cordoba");
		
		Assert.assertEquals(partidoEsperado,partidoObtenido);		
	}
}
