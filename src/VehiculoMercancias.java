public abstract class VehiculoMercancias extends Vehiculo {
	
	protected int PMA;

	public int getPMA() {
		return PMA;
	}

	@Override
	public String toString() {
		return "VehiculoMercancias [PMA=" + PMA + ", matricula=" + matricula + ", precioBase=" + precioBase
				+ ", suplemento=" + suplemento + ", getPMA()=" + getPMA() + ", getSuplemento()=" + getSuplemento()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
