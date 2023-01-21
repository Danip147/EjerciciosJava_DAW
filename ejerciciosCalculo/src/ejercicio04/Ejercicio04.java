package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
	/**
	 * Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a
   	 * cuantas horas y minutos corresponde.
	 */
	public static void ejercicio04() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca número de minutos: ");
		int minutos = sc.nextInt();
		
		int numHoras = minutos / 60;
		int minutosSobrantes = minutos % 60;
		
		System.out.println(minutos + " minutos " + "equivale a " + numHoras + " hora" +(numHoras ==1 ? "" :"s") + " "+ minutosSobrantes + " minutos" );
		
	}

	public static void main(String[] args) {
		ejercicio04();
	}

}
