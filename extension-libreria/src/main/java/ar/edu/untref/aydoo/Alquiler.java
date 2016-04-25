package ar.edu.untref.aydoo;

public class Alquiler {
	
	private int periodo;
	private double precio;
	private boolean elPeriodoEsCorrecto;
	
	public Alquiler(int periodo){
		this.periodo = periodo;
		this.precio = 0;
		elPeriodoEsCorrecto = false;
	}
	
	public int getPeriodo(){
		return this.periodo;
	}
	
	public void setPrecio(double precio){
		this.precio = precio;
	}
	
	public double getPrecio(){
		return this.precio;
	}
	
	public boolean estaDentroDelPeriodoCorrecto(){
		return elPeriodoEsCorrecto;
	}
	
	public void setEsPeriodoCorrecto(boolean esPeriodoCorrecto){
		this.elPeriodoEsCorrecto = esPeriodoCorrecto;
	}
}
