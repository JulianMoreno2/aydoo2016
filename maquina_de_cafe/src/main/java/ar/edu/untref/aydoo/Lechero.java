package ar.edu.untref.aydoo;

public class Lechero {

	public Vaso prepararEnEsteVaso(Vaso vaso) {
		
		System.out.println("Lechero: pongo leche en el vaso");
		vaso.setContenido("Leche");
		System.out.println("Lechero: devolver vaso");
		return vaso;
	}
}
