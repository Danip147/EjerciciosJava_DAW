package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void ejercicio01() {
		Scanner sc = new Scanner(System.in);
		
		int numAleatorio = (int) (Math.random()*10+ 1);
		boolean adivina = false;

		while (!adivina) {

			System.out.println("Introduce un número: ");
			int num1 = sc.nextInt();

			if (num1 == numAleatorio) {
				adivina = true;

			} else {
				System.out.println("Sigue intentadolo");
			}
		}
		System.out.println("Acertaste el número el número era el " + numAleatorio);

		sc.close();

	}

	public static void main(String[] args) {
		ejercicio01();
	}

}
