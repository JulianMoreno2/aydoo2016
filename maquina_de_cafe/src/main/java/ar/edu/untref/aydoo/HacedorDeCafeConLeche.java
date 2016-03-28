package ar.edu.untref.aydoo;

public class HacedorDeCafeConLeche {
	
	private Cafetero cafetero;
	private Lechero lechero;
	
	public HacedorDeCafeConLeche(){
		this.cafetero = new Cafetero();
		this.lechero = new Lechero();
	}

	public void prepararEnEsteVaso(Vaso vaso) {
		
		System.out.println("HacedorDeCafeConLeche: preparando.");
		
		cafetero.prepararEnEsteVaso(vaso);
		lechero.prepararEnEsteVaso(vaso);

		System.out.println("HacedorDeCafeConLeche: devolver vaso.");
	}
}
