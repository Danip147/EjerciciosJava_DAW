package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	
	/**
	 * Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
	 */
	
	public static void ejercicio02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca primer número número: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca segundo número: ");
		int num2 = sc.nextInt();
		
		System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es: " + (num1 + num2));
		System.out.println("El resultado de restar " + num1 + " - " + num2 + " es: " + (num1 - num2));
		System.out.println("El resultado de multiplicar " + num1 + " x " + num2 + " es: " + (num1 * num2));
		
		if(num2 != 0 ) {
			System.out.println("El resultado de dividir " + num1 + " / " + num2 + " es: " + (num1 / num2));
		}else {
			System.out.println("El número no se puede dividir entre " + num2);
		}
			
		sc.close();
	}

	public static void main(String[] args) {
		ejercicio02();

	}

}
