public abstract class Vehiculo implements Comparable<Vehiculo>, Alquilable{
	
	String matricula;
	double precioBase = 50;
	double suplemento;
	
	public double getSuplemento() {
		return suplemento;
	}
	
	public int compareTo (Vehiculo o) {
		return this.matricula.compareTo(o.matricula);
	}
	
	public abstract double getPrecioAlquiler(int dias);
	
	
}
