package conversorunidades;
public class Temperatura {
	
	private double valor; 
	private String unidad; 
	
	public Temperatura(double valor, String unidad) {
		this.valor = valor;
		this.unidad = unidad.toLowerCase();
		validarUnidad();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
		validarUnidad();
	}
	private void validarUnidad() {
        if (!this.unidad.equals("celsius") && !this.unidad.equals("fahrenheit") && !this.unidad.equals("kelvin")) {
            throw new IllegalArgumentException("Unidad de temperatura no válida: " + this.unidad + ". Debe ser Celsius, Fahrenheit o Kelvin.");
        }
    }
	public void convertirACelsius() {
        if (this.unidad.equals("fahrenheit")) {
            this.valor = (this.valor - 32) * 5.0 / 9.0;
            this.unidad = "celsius";
        } else if (this.unidad.equals("kelvin")) {
            this.valor = this.valor - 273.15;
            this.unidad = "celsius";
        }
    }

    public void convertirAFahrenheit() {
        if (this.unidad.equals("celsius")) {
            this.valor = (this.valor * 9.0 / 5.0) + 32;
            this.unidad = "fahrenheit";
        } else if (this.unidad.equals("kelvin")) {
            this.valor = (this.valor - 273.15) * 9.0 / 5.0 + 32;
            this.unidad = "fahrenheit";
        }
    }

    public void convertirAKelvin() {
        if (this.unidad.equals("celsius")) {
            this.valor = this.valor + 273.15;
            this.unidad = "kelvin";
        } else if (this.unidad.equals("fahrenheit")) {
            this.valor = (this.valor - 32) * 5.0 / 9.0 + 273.15;
            this.unidad = "kelvin";
        }
    }

	@Override
	public String toString() {
		return "Temperatura [valor=" + valor + ", unidad=" + unidad + "]";
	}
    
}//fin de la clase
