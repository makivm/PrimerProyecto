
/** Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + ( 9 * C / 5) */

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduzca temperatura en grados centigrados ");
		float centigrados=entrada.nextFloat();
			
		System.out.println("La temperatura en Fahrenheit es de: "+ (32+(9*centigrados/5)));
		
		entrada.close();
	}

}
