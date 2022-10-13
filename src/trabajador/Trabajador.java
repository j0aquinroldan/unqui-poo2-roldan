package trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresosAnuales = new ArrayList<Ingreso>();

	public Trabajador(List<Ingreso> ingresosAnuales) {
		this.setIngresosAnuales(ingresosAnuales);
	}

	public List<Ingreso> getIngresosAnuales() {
		return ingresosAnuales;
	}

	public void setIngresosAnuales(List<Ingreso> ingresosAnuales) {
		this.ingresosAnuales = ingresosAnuales;
	}

	public double getTotalPercibido() {
		return this.getIngresosAnuales()
		.stream()
		.reduce(0d,(subtotal, ingreso) -> subtotal + ingreso.getMonto() , Double::sum);
	}
	
	public List<Ingreso> filterIngresosImponibles(){
		return this.getIngresosAnuales()
				.stream().filter(ingreso -> ingreso.esImponible()).toList();
	}
	
	public double getMontoImponible() {
		return this.filterIngresosImponibles()
				.stream()
				.reduce(0d, (subtotal, ingreso) -> subtotal + ingreso.getMonto(), Double::sum);
			}

	public double getImpuestoAPagar() {
		return this.getMontoImponible()*0.02;
	}

	
}
