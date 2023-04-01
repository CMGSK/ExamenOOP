public class Coche extends VehiculoPersonas {
	
	Coche(String matricula, int plazas){
		this.matricula = matricula;
		this.plazas = plazas;
		this.suplemento = 1.5;
	}

	@Override
	public double getPrecioAlquiler(int dias) {
		return this.precioBase + (this.plazas * this.suplemento) * dias;
	}

}
