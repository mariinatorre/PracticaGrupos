package conversorunidades;

public class Peso {
	
	private double valorPeso;
	private String unidadPeso;
	
	final int GRAMO_KILOGRAMO = 1000;
	final double GRAMO_LIBRA = 453.59237;
	final double KILOGRAMO_LIBRA = 2.20462262;
	
	public Peso(double valorPeso, String unidadPeso) {
		this.valorPeso=valorPeso;
		this.unidadPeso=unidadPeso.toLowerCase();
		
		}
	
	public double getValorPeso() {
		return valorPeso;
	}

	public void setValorPeso(double valorPeso) {
		this.valorPeso = valorPeso;
	}

	public String getUnidadPeso() {
		return unidadPeso;
	}

	public void setUnidadPeso(String unidadPeso) {
		this.unidadPeso = unidadPeso;
		validarUnidadPeso();
	}

	private void validarUnidadPeso() {
		if (!this.unidadPeso.equals("gramos") 
				&& !this.unidadPeso.equals("kilogramos") 
				&& !this.unidadPeso.equals("libras")) {
			throw new IllegalArgumentException("Unidad de peso no válida."
					+ "Debe ser gramos, kilogramos o libras.");
		}
	}
	
	public void conversorGramos() {
		if (this.unidadPeso.equals("kilogramos")) {
			this.valorPeso = this.valorPeso/GRAMO_KILOGRAMO;
			this.unidadPeso = "gramos";
		} else if (this.unidadPeso.equals("libras")) {
			this.valorPeso = this.valorPeso/GRAMO_LIBRA;
			this.unidadPeso = "gramos";
		}
	}
	
	public void conversorKilogramos() {
		if (this.unidadPeso.equals("gramos")) {
			this.valorPeso = this.valorPeso*GRAMO_KILOGRAMO;
			this.unidadPeso = "kilogramos";
		} else if (this.unidadPeso.equals("libras")) {
			this.valorPeso = this.valorPeso*KILOGRAMO_LIBRA;
			this.unidadPeso = "kilogramos";
		}
	}
	
	public void conversorLibras() {
		if (this.unidadPeso.equals("gramos")) {
			this.valorPeso = this.valorPeso*GRAMO_LIBRA;
			this.unidadPeso = "libras";
		} else if (this.unidadPeso.equals("kilogramos")) {
			this.valorPeso = this.valorPeso/KILOGRAMO_LIBRA;
			this.unidadPeso = "libras";
		}
	}
	
	@Override
	public String toString() {
		return "Peso [valor=" + valorPeso + ",unidad=" + unidadPeso + "]";
	}
	
	
}//fin clase
