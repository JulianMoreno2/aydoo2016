package ar.edu.untref.aydoo;

public class AlquilerCuatrimestral extends Alquiler{
		
	public AlquilerCuatrimestral(int periodo) {
		super(periodo);
		if(this.estaDentroDelPeriodoCorrecto()){
			super.setPrecio(periodo * (200 - (200 * 0.1)));
		}
	}
	
	@Override
	public boolean estaDentroDelPeriodoCorrecto(){
		
		if(super.getPeriodo() == 1 || super.getPeriodo() == 2){
			super.setEsPeriodoCorrecto(true);
		}else{
			super.setEsPeriodoCorrecto(false);
		}
		
		return super.estaDentroDelPeriodoCorrecto();
	}
	
	public double getPrecio(){
		return super.getPrecio() + (super.getPrecio() * 0.1);
	}
}
