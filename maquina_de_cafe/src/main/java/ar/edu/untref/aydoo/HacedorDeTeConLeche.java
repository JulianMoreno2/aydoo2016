package ar.edu.untref.aydoo;

public class HacedorDeTeConLeche {
	
	private HacedorDeTe hacedorDeTe;
	private Lechero lechero;
	
	public HacedorDeTeConLeche(){
		this.hacedorDeTe = new HacedorDeTe();
		this.lechero = new Lechero();
	}

	public void prepararEnEsteVaso(Vaso vaso) {
		
		System.out.println("HacedorDeTeConLeche: preparando.");
		
		hacedorDeTe.prepararEnEsteVaso(vaso);
		lechero.prepararEnEsteVaso(vaso);
		
		System.out.println("HacedorDeTeConLeche: devolver vaso.");
	}
}
