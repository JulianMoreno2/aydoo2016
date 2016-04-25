package ar.edu.untref.aydoo;


public class AlquilerDiario extends Alquiler {

	public AlquilerDiario(int periodo) {
		super(periodo);
		if(this.estaDentroDelPeriodoCorrecto()){
			super.setPrecio(periodo * 10);			
		}
	}
	
	@Override
	public boolean estaDentroDelPeriodoCorrecto(){
		
		if(super.getPeriodo() >= 3 && super.getPeriodo() <= 25){
			super.setEsPeriodoCorrecto(true);
		}else{
			super.setEsPeriodoCorrecto(false);
		}
		
		return super.estaDentroDelPeriodoCorrecto();
	}
	
}
