package Ex1;

public class Persona {
	
	private static final char HOMBRE = 'H';
	private static final char MUJER = 'M';
	
	private String nombre;
	private int edad;
	private String dni="";
	private char sexo;
	private double peso;
	private double altura;
	
	public Persona(String dni) {
		this.nombre="";
		this.edad=0;
		this.dni=dni;
		sexo=HOMBRE;
		this.peso=0;
		this.altura=0;
	}
	
	public Persona(String nombre,int edad,char sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.dni="";
		this.sexo=sexo;
		this.peso=0;
		this.altura=0;
	}
	
	public Persona(String nombre,int edad,String dni,char sexo,double peso,double altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.dni=dni;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
	}
	
	public String toString() {
		return "Nombre - "+this.nombre+
				"\nEdad - "+this.edad+
				"\nDNI - "+this.dni+
				"\nSexo - "+this.sexo+
				"\nPeso - "+this.peso+
				"\nAltura - "+this.altura;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

}
