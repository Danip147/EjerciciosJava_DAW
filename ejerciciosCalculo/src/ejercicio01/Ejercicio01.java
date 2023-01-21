package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	
	/**
	 * Calcular el perí­metro y área de un rectángulo dada su base y su altura.
	 */
	public static void ejercicio01() {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce alto: ");
		int alto = sc.nextInt();
		
		sc.nextLine();
	
		System.out.println("Introduce ancho: ");
		int ancho = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("El perímetro del rectángulo es: " + ((alto*2) + (ancho*2)) + " cm");
		System.out.println("El área del rectangulo es: " + (alto * ancho) + " cm²");
		
		sc.close();
		
	}

	public static void main(String[] args) {
		ejercicio01();
	}

}
