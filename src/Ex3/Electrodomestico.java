package Ex3;

public class Electrodomestico {
	
	private static final double precioBaseInicial = 100;
	private static final String colorInicial = "BLANCO";
	private static final char consumoInicial = 'F';
	private static final double pesoInicial = 5;
	
	private double precioBase;
	private String color;
	private char consumo;
	private double peso;

	public Electrodomestico() {
		this.setPrecioBase(precioBaseInicial);
		this.setColor(colorInicial);
		this.setConsumo(consumoInicial);
		this.setPeso(pesoInicial);
		
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this.setPrecioBase(precioBase);
		this.setPeso(peso);
		this.setColor(colorInicial);
		this.setConsumo(consumoInicial);
		
	}
	
	public Electrodomestico(double precioBase, String color, char consumo, double peso) {
		this.setPrecioBase(precioBase);
		this.setPeso(peso);
		this.setColor(comprobarColor(color));
		this.setConsumo(consumo);
	}
	
	public String comprobarColor(String color) {
		//blanco, negro, rojo, azul y gris
		color = color.toUpperCase();
		
		if (color.equals("BLANCO") || color.equals("NEGRO") || color.equals("ROJO") || color.equals("AZUL") || color.equals("GRIS")) {
			
			return color;
		}
		else
			return "BLANCO";
		
		
		
	}
	
	public String toString() {
		return "Precio - "+this.precioBase+" €"+
				"\nColor - "+this.color+
				"\nConsumo - "+this.consumo+
				"\nPeso - "+this.peso+" Kg";
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}
