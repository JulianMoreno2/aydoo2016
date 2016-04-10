package ar.edu.untref.aydoo;

public class Cafetero {

	public void prepararEnEsteVaso(Vaso vaso) {
		
		System.out.println("Hacedor de Cafe: pongo cafe en el vaso.");
		vaso.setContenido("Cafe");
		System.out.println("Hacedor de Cafe: devolver vaso.");
	}
}
