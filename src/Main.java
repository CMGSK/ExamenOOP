import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
	Coche coche = new Coche("1243ASD", 5);
	Microbus microbus = new Microbus ("8723GAS", 39);
	Furgoneta furgoneta = new Furgoneta ("4673FDS", 3);
	Camion camion = new Camion ("2211AAA", 40);
	
	Set<Vehiculo> garaje = new TreeSet<>();
	garaje.add(furgoneta);
	garaje.add(coche);
	garaje.add(camion);
	garaje.add(microbus);
	garaje.forEach(e -> System.out.println(e + "\n" + e.getPrecioAlquiler(23)));
	
	
	}

}
