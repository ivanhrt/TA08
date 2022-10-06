package Ex2;

import java.util.Random;

public class Contraseña {
	
	private int longitud;
	private String contraseña;

	public Contraseña() {
		this.setContraseña(generarContraseña(8));
	}

	public Contraseña(int longitud) {
		this.longitud=longitud;
		this.setContraseña(generarContraseña(longitud));
	}
	
	private String generarContraseña(int n) {
		Random rand = new Random();
		String contraseña="";
		
		for(int i=0;i<n;i++) {
			char c = (char) (rand.nextInt(126-33) +33);
			contraseña+= c;
		}
		
		return contraseña;
	}


	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public String toString() {
		return "Longitud - "+this.longitud+
				"\nContraseña - "+this.contraseña;
	}

}
