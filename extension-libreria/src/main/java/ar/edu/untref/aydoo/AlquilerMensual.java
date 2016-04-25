package ar.edu.untref.aydoo;

public class AlquilerMensual extends Alquiler{
	
	public AlquilerMensual(int periodo) {
		super(periodo);
		if(this.estaDentroDelPeriodoCorrecto()){
			super.setPrecio(periodo * 200);			
		}
	}	
	
	@Override
	public boolean estaDentroDelPeriodoCorrecto(){
		
		if(super.getPeriodo() >= 1 && super.getPeriodo() <= 3){
			super.setEsPeriodoCorrecto(true);
		}else{
			super.setEsPeriodoCorrecto(false);
		}
		
		return super.estaDentroDelPeriodoCorrecto();
	}
}
