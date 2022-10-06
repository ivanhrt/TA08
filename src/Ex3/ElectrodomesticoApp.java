package Ex3;

import java.util.Scanner;

public class ElectrodomesticoApp {
	
	public static final Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Qué método quieres probar? (1, 2 o 3)");
		
		int opcion = teclado.nextInt();
		
		switch (opcion) {
		case 1:
			metodo1(); break;
		case 2:
			metodo2(); break;
		case 3:
			metodo3(); break;
		}
		teclado.close();
	}
	
	public static void metodo1() {
		System.out.println("No es necesario introducir ningún valor");
		Electrodomestico elec = new Electrodomestico();
		System.out.println(elec);
	}
	
	public static void metodo2() {
		
		System.out.println("Introduce el precio base");
		Scanner teclado = new Scanner(System.in);
		double precio = teclado.nextDouble();
		System.out.println("Introduce el peso");
		double peso = teclado.nextDouble();
		
		Electrodomestico elec = new Electrodomestico(precio, peso);
		System.out.println(elec);
	}

	public static void metodo3() {
		
		System.out.println("Introduce el precio base");
		
		double precio = teclado.nextDouble();
		System.out.println("Introduce el color (blanco, negro, rojo, azul o gris)");
		String color = teclado.next();
		System.out.println("Introduce el consumo");
		char consumo = teclado.next().toUpperCase().charAt(0);
		System.out.println("Introduce el peso");
		double peso = teclado.nextDouble();
		
		Electrodomestico elec = new Electrodomestico(precio, color, consumo, peso);
		System.out.println(elec);
	
	}
	

}
