
/** 3.Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.*/

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		float num=entrada.nextFloat();
		
		System.out.println("El doble es: "+ num*2 + "y el triple: "+ num*3 );
		
		entrada.close();

	}

}
