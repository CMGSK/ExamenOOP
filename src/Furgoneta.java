public class Furgoneta extends VehiculoMercancias {

	Furgoneta(String matricula, int PMA){
		this.matricula = matricula;
		this.PMA = PMA;
		this.suplemento = 20 * PMA;
	}
	
	@Override
	public double getPrecioAlquiler(int dias) {
		return this.suplemento * dias;
	}

}
