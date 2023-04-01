public abstract class VehiculoPersonas extends Vehiculo {
	
	protected int plazas;

	public int getPlazas() {
		return plazas;
	}

	@Override
	public String toString() {
		return "VehiculoPersonas [plazas=" + plazas + ", matricula=" + matricula + ", precioBase=" + precioBase
				+ ", suplemento=" + suplemento + ", getPlazas()=" + getPlazas() + ", getSuplemento()=" + getSuplemento()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


}
