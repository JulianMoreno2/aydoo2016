package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {
	
	private Vaso vaso;
	private HacedorDeCafeConLeche hacedorDeCafeConLeche;
	private HacedorDeTeConLeche hacedorDeTeConLeche;
	private Azucarero azucarero;
	
	public MaquinaExpendedoraDeBebidas(){
		this.vaso = new Vaso();
		this.azucarero = new Azucarero();
		this.hacedorDeCafeConLeche = new HacedorDeCafeConLeche();
		this.hacedorDeTeConLeche = new HacedorDeTeConLeche();
	}
	
	public Vaso hacerCafeConLecheConNDeAzucar(int n){	
		
		System.out.println("Maquina Expendedora de Bebidas: preparando Cafe con Leche con "+n+" de azucar");
	
		hacedorDeCafeConLeche.prepararEnEsteVaso(this.vaso);
		azucarero.ponerNenEsteVaso(this.vaso,n);
		
		System.out.println("Aqui tiene su Cafe con Leche con "+n+" cucharadas de Azucar");
		
		return this.vaso;
	}
	
	public Vaso hacerTeConLecheConNDeAzucar(int n){		
		
		System.out.println("Maquina Expendedora de Bebidas: preparando Te con Leche con "+n+" de azucar");
		
		hacedorDeTeConLeche.prepararEnEsteVaso(this.vaso);
		azucarero.ponerNenEsteVaso(this.vaso,n);
		
		System.out.println("Aqui tiene su Te con Leche con "+n+" cucharadas de Azucar");
		
		return this.vaso;
	}
	
	public Vaso getVaso(){
		return this.vaso;
	}
}
