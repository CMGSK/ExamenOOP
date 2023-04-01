public class Microbus extends VehiculoPersonas{
	
	Microbus(String matricula, int plazas){
		this.matricula = matricula;
		this.plazas = plazas;
		this.suplemento = 2;		
	}
	
	@Override
	public double getPrecioAlquiler(int dias) {
		return this.precioBase + (dias * this.plazas * this.suplemento) * dias;
	}

}
