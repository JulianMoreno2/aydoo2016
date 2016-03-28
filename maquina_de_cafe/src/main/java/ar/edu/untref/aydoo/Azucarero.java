package ar.edu.untref.aydoo;

public class Azucarero {

	public void ponerNenEsteVaso(Vaso vaso, int n) {
		
		System.out.println("Azucurero: pongo "+n+" cucharadas de azucar en el vaso");
		vaso.setContenido(n+" de azucar");
		System.out.println("Azucarero: devuelvo vaso.");
	}
}
