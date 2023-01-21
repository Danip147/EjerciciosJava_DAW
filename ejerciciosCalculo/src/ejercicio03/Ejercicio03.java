package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
	/**
	 * Calcular la media de tres números pedidos por teclado
	 */
	public static void ejercicio03() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca primer número: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca segundo número: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca tercer número: ");
		int num3 = sc.nextInt();
		
		System.out.println("La media de los 3 números introducidos anteriormente es: " + ((num1+num2+num3)/3));
		
		sc.close();	
	}

	public static void main(String[] args) {
		ejercicio03();

	}

}
